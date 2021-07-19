<template>
    <div id="myChart" :style="{width: '800px', height: '600px'}"></div>
</template>

<script>
import axios from "axios";

export default {
    name: "Pie",
    data() {

    },
    mounted() {
        let _this = this
        axios.get('http://localhost:8181/fruit/pieVO').then(function (response) {
            // 基于准备好的dom，初始化echarts实例
            let myChart = _this.$echarts.init(document.getElementById('myChart'))
            // 绘制图表
            myChart.setOption(
                {
                    title: {
                        text: '水果销量统计',
                        subtext: '纯属虚构',
                        left: 'center'
                    },
                    tooltip: {
                        trigger: 'item'
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                    },
                    series: [
                        {
                            // name: '访问来源',
                            type: 'pie',
                            radius: '50%',
                            data: response.data.sort(function (a,b){return a.value - b.value;}),
                            roseType:'radius',
                            emphasis: {
                                itemStyle: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
                }
            )
        })


    }
}
</script>

<style scoped>

</style>

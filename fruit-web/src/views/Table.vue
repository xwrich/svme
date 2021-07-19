<template>
    <el-table
        :data="tableData"
        border
        style="width: 100%">
        <el-table-column
            fixed
            prop="id"
            label="水果ID"
            width="150">
        </el-table-column>
        <el-table-column
            prop="name"
            label="名称"
            width="160">
        </el-table-column>
        <el-table-column
            prop="sale"
            label="销量"
            width="120">
        </el-table-column>
        <el-table-column
            prop="icon"
            label="图片"
            width="120">
            <template slot-scope="scope">
                <img :src="scope.row.icon" style="height: 70px">
            </template>
        </el-table-column>
        <el-table-column
            label="操作"
            width="200">
            <template slot-scope="scope">
                <el-button @click="handleDel(scope.row)" type="primary" size="small">删除</el-button>
                <el-button @click="handleEdit(scope.row)" type="success" size="small">编辑</el-button>
            </template>
        </el-table-column>
    </el-table>
</template>

<script>
import axios from "axios";

export default {
    name: 'Table',
    methods: {
        //编辑
        handleEdit(object){
            this.$router.push('/edit/?id=' + object.id)
        },

        //删除
        handleDel(object) {
            let _this = this
            _this.$confirm('是否确定删除' + object.name + '?','删除数据',{
                confirmButtonText:'确定',
                cancelButtonText:'取消',
                type:"warning"
            }).then(() => {
                axios.delete('http://localhost:8181/fruit/delete/' + object.id).then(function (response){
                    if (response.data){
                        _this.$alert(object.name + '删除成功!','删除数据',{
                            callback:action => {
                                location.reload()
                            }
                        });
                    }
                })
            }).catch(() => {

            });

        }
    },
    created() {
        let _this = this
        axios.get('http://localhost:8181/fruit/list').then(function (response) {
            // console.log(response);
            _this.tableData = response.data
        })
    },
    data() {
        return {
            tableData: null,
        }
    },
}
</script>

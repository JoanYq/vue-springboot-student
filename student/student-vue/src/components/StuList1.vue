<template>
    <div>
        <el-table
    :data="tableData"
    border
    style="width: 100%">
    <el-table-column
      fixed
      prop="id"
      label="编号"
      width="150">
    </el-table-column>
    <el-table-column
      prop="name"
      label="姓名"
      width="120">
    </el-table-column>
    <el-table-column
      prop="sex"
      label="性别"
      width="120">
    </el-table-column>
    <el-table-column
      prop="address"
      label="地址"
      width="300">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="200">
      <template slot-scope="scope">
        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
        <el-button type="text" size="small">编辑</el-button>
      </template>
    </el-table-column>
  </el-table>
  <el-pagination
  background
  layout="prev, pager, next"
  :page-size=2
  :total="total"
  @current-change="page">
</el-pagination>
    </div>
</template>

<script>
  export default {
    methods: {
      handleClick(row) {
        console.log(row);
      },
      page(currentPage){
          const _this = this;
          this.$axios.get('http://localhost:8181/stu/findAll/'+currentPage+'/2').then(function(resp) {
              _this.tableData = resp.data.content;
              _this.total = resp.data.totalElements;
              console.log(resp)
          })
      }
    },
    created(){
        const _this = this;
          this.$axios.get('http://localhost:8181/stu/findAll/1/2').then(function(resp) {
              _this.tableData = resp.data.content;
              _this.total = resp.data.totalElements;
              console.log(resp)
          })
      },
      data() {
      return {
          total:null,
        tableData: null
      }
    }
  }
</script>
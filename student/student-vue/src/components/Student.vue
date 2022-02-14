<template>
  <div>
    <table>
      <tr>
        <td>id</td>
        <td>name</td>
      </tr>
      <!-- <tr>
          <td>{{stus[0].id}}</td>
          <td>{{stus[0].name}}</td>
      </tr>
      <tr>
          <td>{{stus[1].id}}</td>
          <td>{{stus[1].name}}</td>
      </tr> -->
      <!-- <tr v-for="item in stus" :key="item"> -->
      <tr v-for="item in stus" :key="item.id">
        <td>{{item.id}}</td>
        <td>{{item.name}}</td>
      </tr>
    </table>
    {{msg}}
  </div>
</template>
<script>
  export default {
    name: 'Student',
    data() {
      return {
        msg: 'Welcome stu',
        stus: [
          {
            id: 1,
            name: 'joan'
          },
          {
            id: 2,
            name: '张三'
          }
        ]

      }
    },
    created() {
        alert('123')
        const _this = this
        this.$axios.get('http://localhost:8181/stu/findAll').then(function(resp) {
            console.log(resp)
            _this.stus=resp.data
        })
    }
  }
</script>
<style scoped>

</style>

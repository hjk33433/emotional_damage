<template>
  <div class="hello">
    <el-container>
  <el-header>
    <el-input v-model="input" placeholder="请输入内容" style="width: 80%"></el-input>
    <el-button type="primary" @click="query">搜索</el-button></el-header>
  <el-main>
    <hr/>
    <div id="app">
      <wordcloud
      :data="defaultWords"
      nameKey="name"
      valueKey="value"
      :color="myColors"
      :showTooltip="false"
      :wordClick="wordClickHandler">
      </wordcloud>
    </div>

    </el-main>
</el-container>

  </div>
</template>
<style>
el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }

  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }

  body > .el-container {
    margin-bottom: 40px;
  }

  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }

  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>
<script>
import wordcloud from 'vue-wordcloud'
import axios from 'axios'
export default {
  name: 'app',
  components: {
    wordcloud
  },
  methods: {
    wordClickHandler (name, value, vm) {
      console.log('wordClickHandler', name, value, vm)
    },
    query () {
      axios.post('', this.input).then(res => {

      })
    }},
  data () {
    return {
      input: '',
      myColors: ['#1f77b4', '#629fc9', '#94bedb', '#c9e0ef'],
      defaultWords: [{
        'name': 'Cat',
        'value': 26
      },
      {
        'name': 'fish',
        'value': 19
      },
      {
        'name': 'things',
        'value': 18
      },
      {
        'name': 'look',
        'value': 16
      },
      {
        'name': 'two',
        'value': 15
      },
      {
        'name': 'fun',
        'value': 9
      }
      ]
    }
  }
}
</script>

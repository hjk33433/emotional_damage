<template>
  <div class="hello">
    emotion
    <el-input type='text' :rows="2" placeholder="请输入" v-model="input"/>
    <hr/>
    <el-button type="primary" >搜索</el-button>

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
  </div>
</template>
<script>
import wordcloud from 'vue-wordcloud'
export default {
  name: 'app',
  components: {
    wordcloud
  },
  methods: {
    wordClickHandler (name, value, vm) {
      console.log('wordClickHandler', name, value, vm)
    }
  },
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

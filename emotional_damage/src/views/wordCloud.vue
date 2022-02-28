<template>
  <vue-wordcloud style="width: 100%; height: 500px;"
    :options="options"
    :loading="loading"
  />
</template>
<script>
export default {
  data: function () {
    return {
      loading: true,
      options: {
        renderer: 'div',
        list: [],
        backgroundColor: 'transparent',
        gridSize: 35,
        fontFamily: 'Finger Paint, cursive, sans-serif',
        fontWeight: '600',
        color: 'random-dark',
        minFontSize: 30,
        rotateRatio: 0,
        click: this.clickTag,
        cursorWhenHover: 'pointer'
      }
    }
  },
  mounted () {
    this.getTagArr()
  },
  methods: {
    clickTag (item) {
      this.$router.push({ name: 'tag', params: { tagName: item[0] } })
    },
    getTagArr () {
      this.$http.get('/tag/queryAll').then(res => {
        this.options.list = res.data
        this.loading = false
      })
    }
  }
}
</script>

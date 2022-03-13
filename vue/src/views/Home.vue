<template>
  <div style="padding: 10px">
    <div style="margin: 10px 0">
      <el-button type="primary" @click="add">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">导出</el-button>
    </div>

    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 20%"/>
      <el-button type="primary" style="margin-left: 10px">查询</el-button>
    </div>
    <el-table :data="tableData" stripe style="width: 100%">
      <el-table-column prop="id"
                       sortable
                       label="ID" />
      <el-table-column prop="username" label="用户名" />
      <el-table-column prop="nickName" label="昵称" />
      <el-table-column prop="age" label="年龄" />
      <el-table-column prop="sex" label="性别" />
      <el-table-column prop="address" label="地址" />
      <el-table-column fixed="right" label="Operations" width="120">
        <template #default>
          <el-popconfirm title="确认删除吗?" >
            <template #reference>
              <el-button type="text">删除</el-button>
            </template>
          </el-popconfirm>
          <el-button type="text" >编辑</el-button>
        </template>
      </el-table-column>
    </el-table>

    <div style="margin: 10px 0">
      <el-pagination
          v-model:currentPage="currentPage4"
          v-model:page-size="pageSize4"
          :page-sizes="[100, 200, 300, 400]"
          :small="small"
          :disabled="disabled"
          :background="background"
          layout="total, sizes, prev, pager, next, jumper"
          :total="400"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
      >
      </el-pagination>
<!--      <el-pagination-->
<!--          :currentPage="currentPage"-->
<!--          :page-size="10"-->
<!--          :page-sizes="[5, 10, 20]"-->
<!--          :small="small"-->
<!--          :disabled="disabled"-->
<!--          :background="background"-->
<!--          layout="total, sizes, prev, pager, next, jumper"-->
<!--          :total="total"-->
<!--          @size-change="handleSizeChange"-->
<!--          @current-change="handleCurrentChange">-->
<!--      </el-pagination>-->

      <el-dialog v-model="dialogVisible" title="提示" width="30%">
        <el-form :modle="form" label-width="120px">
          <el-form-item label="用户名">
            <el-input v-model="form.username" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="昵称">
            <el-input v-model="form.nickName" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="年龄">
            <el-input v-model="form.age" style="width: 80%"></el-input>
          </el-form-item>
          <el-form-item label="性别">
            <el-radio v-model="form.sex" label="男">男</el-radio>
            <el-radio v-model="form.sex" label="女">女</el-radio>
            <el-radio v-model="form.sex" label="未知">未知</el-radio>
          </el-form-item>
          <el-form-item label="地址">
            <el-input type="textarea" v-model="form.address" style="width: 80%"></el-input>
          </el-form-item>
        </el-form>
        <template #footer>
          <span class="dialog-footer">
            <el-button @click="dialogVisible = false">取消</el-button>
            <el-button type="primary" @click="save">确认</el-button>
          </span>
        </template>
      </el-dialog>
    </div>
  </div>
</template>

<script>

export default {
  name: 'HomeView',
  components: {

  },
  currentPage: 1,
  total:10,
  data() {
    return {
      form: {},
      dialogVisible: false,
      search: '',
      tableData: [

      ]
    }
  },
  methods: {
    add() {
      this.dialogVisible = true
      this.form = {}
    },
    save() {

    },
    handleEdit() {

    },
    handleSizeChange() {

    },
    handleCurrentChange() {

    },
  }
}
</script>

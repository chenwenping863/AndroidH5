1、显示intent

Intent intent = new Intent(MainActivity.this, SecondActivity.class);
startActivity(intent);

Intent intent = new Intent();
ComponentName component = new CpmponentName(MainActivity.this, SecondActivity.class);
intent.setComponent();

intent.setClass(MainActivity.this, SecondActivity.class);
startActivity(intent);


通过显示的方式启动其他应用程序中的Activity

Intent intent = new Intent();
intent.setClassName("包名"， "包名 + 类名") ;

startActivity();

2、隐示intent
启动别的应用程序中的某一个Activity
组件名称被视为应用程序私有的，且名称可能发生更改，为了去耦合一般不推荐向其他应用程序发送Intent
 规范的启动 其他App的Activity

隐示intent启

告诉系统你需要的Activity ,由系统为你找到合适的Activity的过程
避免在Intent代码中固化包名

intent的 Action
Action 代表该Intent所要完成的一个抽象"动作"

<intent-filter>
    <action android:name="android.action.cwp.xxx"/>
    <category android:name = "android.intent.categrory.DEFUALT" />
</intent-filter>

intent.setAction("android.action.cwp.xxx");
Action 本身只是一个字符串，并不起到作用
一个INTENT 对象最多只能包含一个Action 属性
intent.setAction("android.action.cwp.xxx");
系统本省默认提供了很多Action供开发者调用


webview 使用

内嵌浏览器空间
需添加访问网络权限


使用时无需考虑网络访问的子线程

加载url
webView.loadUrl()

加载HTML
webView.loadData();


可以在网页中调用android的功能

设备信息查询
调用对话框
首先使用webView允许执行javascript

getSettings 可以获得webview的设置

将JAVASCRIPT代码绑定到Android中的代码

通过addJavascriptInterface()绑定两者
在android代码中实现对应的接口给javascript

在Script中明确调用接口


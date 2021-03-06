/** kit_admin-v1.0.4 MIT License By http://kit/zhengjinfan.cn */
 ;/**
 * Name:app.js
 * Author:Van
 * E-mail:zheng_jinfan@126.com
 * Website:http://kit.zhengjinfan.cn/
 * LICENSE:MIT
 */
var tab;
layui.define(['element', 'nprogress', 'form', 'table', 'loader', 'tab', 'navbar', 'onelevel'], function(exports) {
    var $ = layui.jquery,
        element = layui.element,
        layer = layui.layer,
        _win = $(window),
        _doc = $(document),
        _body = $('.kit-body'),
        form = layui.form,
        table = layui.table,
        loader = layui.loader,
        navbar = layui.navbar,
        _componentPath = 'components/';
    tab = layui.tab
    var app = {
        hello: function(str) {
            layer.alert('Hello ' + (str || 'test'));
        },
        config: {
            type: 'iframe'
        },
        set: function(options) {
            var that = this;
            $.extend(true, that.config, options);
            return that;
        },
        init: function() {
            var that = this,
                _config = that.config;
            if (_config.type === 'page') {
                $('a[kit-loader]').on('click', function() {
                    var url = $(this).data('url'),
                        name = $(this).data('name'),
                        id = $(this).data('id');
                    loader.load({
                        url: url,
                        name: name,
                        id: id === undefined ? new Date().getTime() : id,
                        onSuccess: success
                    });

                    function success(data) {
                        switch (data.name) {
                            case 'table':
                                loader.getScript(_componentPath + 'table/table.js', function() {
                                    var tableIns = table.render(moduleTable.config);
                                    moduleTable.extend({
                                        currTable: tableIns,
                                        table: table,
                                        layer: layer,
                                        form: form,
                                        jquery: $
                                    });
                                });
                                break;
                            case 'form':
                                form.render();
                                break;
                            default:
                                break;
                        }
                    };
                });
            }
            if (_config.type === 'iframe') {
                tab.set({
                    elem: '#container',
                    onSwitch: function(data) { //????????????????????????
                        //console.log(data.layId); //lay-id???
                        //console.log(data.index); //????????????Tab???????????????
                        //console.log(data.elem); //???????????????Tab?????????
                    },
                    closeBefore: function(data) { //???????????????????????????
                        // console.log(data);
                        // console.log(data.icon); //???????????????
                        // console.log(data.id); //lay-id
                        // console.log(data.title); //???????????????
                        // console.log(data.url); //???????????????
                        return true; //??????true?????????
                    }
                }).render();
                //navbar???????????????????????????????????????dom????????????                
                navbar.bind(function(data) {
                    tab.tabAdd(data);
                });
                //navbar??????????????????????????????????????????
                // navbar.set({
                //     remote: {
                //         content:"<%=request.getContextPath()%>/datas/navbar1.json'
                //     }
                // }).render(function(data) {
                //     tab.tabAdd(data);
                // });
                //navbar????????????????????????data????????????
                // navbar.set({
                //     data: [{
                //         id: "1",
                //         title: "????????????",
                //         icon: "fa-cubes",
                //         spread: true,
                //         children: [{
                //             id: "7",
                //             title: "??????",
                //             icon: "&#xe6c6;",
                //             url: "test.html"
                //         }, {
                //             id: "8",
                //             title: "??????",
                //             icon: "&#xe63c;",
                //             url: "form.html"
                //         }]
                //     }, {
                //         id: "5",
                //         title: "??????????????????",
                //         icon: "fa-stop-circle",
                //         url: "https://www.baidu.com",
                //         spread: false
                //     }]
                // }).render(function(data) {
                //     tab.tabAdd(data);
                // });

                //????????????????????????
                var onelevel = layui.onelevel;
                if (onelevel.hasElem()) {
                    onelevel.set({
                        remote: {
                            content:"<%=request.getContextPath()%>/datas/onelevel1.json' //????????????
                        },
                        onClicked: function(id) {
                            switch (id) {
                                case 1:
                                    navbar.set({
                                        remote: {
                                            content:"<%=request.getContextPath()%>/datas/navbar1.json'
                                        }
                                    }).render(function(data) {
                                        tab.tabAdd(data);
                                    });
                                    break;
                                case 2:
                                    navbar.set({
                                        remote: {
                                            content:"<%=request.getContextPath()%>/datas/navbar2.json'
                                        }
                                    }).render(function(data) {
                                        tab.tabAdd(data);
                                    });
                                    break;
                                default:
                                    navbar.set({
                                        data: [{
                                            id: "1",
                                            title: "????????????",
                                            icon: "fa-cubes",
                                            spread: true,
                                            children: [{
                                                id: "7",
                                                title: "??????",
                                                icon: "&#xe6c6;",
                                                url: "test.html"
                                            }, {
                                                id: "8",
                                                title: "??????",
                                                icon: "&#xe63c;",
                                                url: "form.html"
                                            }]
                                        }, {
                                            id: "5",
                                            title: "??????????????????",
                                            icon: "fa-stop-circle",
                                            url: "https://www.baidu.com",
                                            spread: false
                                        }]
                                    }).render(function(data) {
                                        tab.tabAdd(data);
                                    });
                                    break;
                            }
                        }
                    }).render();
                }
            }
            return that;
        }
    };

    //??????test??????
    exports('app', app);
});
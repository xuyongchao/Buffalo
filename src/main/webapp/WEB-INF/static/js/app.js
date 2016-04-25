/**
 * 项目中所有js代码
 */

//菜单栏键盘导航功能
(function($){
    function getParentMenu(rootMenu, menu){
        return findParent(rootMenu);

        function findParent(pmenu){
            var p = undefined;
            $(pmenu).find('.menu-item').each(function(){
                if (!p && this.submenu){
                    if ($(this.submenu)[0] == $(menu)[0]){
                        p = pmenu;
                    } else {
                        p = findParent(this.submenu);
                    }
                }
            });
            return p;
        }
    }

    $.extend($.fn.menubutton.methods, {
        enableNav: function(enabled){
            var curr;
            $(document).unbind('.menubutton');
            if (enabled == undefined){enabled = true;}
            if (enabled){
                $(document).bind('keydown.menubutton', function(e){
                    var currButton = $(this).find('.m-btn-active,.m-btn-plain-active,.l-btn:focus');
                    if (!currButton.length){
                        return;
                    }

                    if (!curr || curr.button != currButton[0]){
                        curr = {
                            menu: currButton.data('menubutton') ? $(currButton.menubutton('options').menu) : $(),
                            button: currButton[0]
                        };
                    }
                    var item = curr.menu.find('.menu-active');

                    switch(e.keyCode){
                        case 13:  // enter
                            item.trigger('click');
                            break;
                        case 27:  // esc
                            currButton.trigger('mouseleave');
                            break;
                        case 38:  // up
                            var prev = !item.length ? curr.menu.find('.menu-item:last') : item.prevAll('.menu-item:first');
                            prev.trigger('mouseenter');
                            return false;
                        case 40:  // down
                            var next = !item.length ? curr.menu.find('.menu-item:first') : item.nextAll('.menu-item:first');
                            next.trigger('mouseenter');
                            return false;
                        case 37:  // left
                            var pmenu = getParentMenu(currButton.data('menubutton') ? $(currButton.menubutton('options').menu) : $(), curr.menu);
                            if (pmenu){
                                curr.menu = pmenu;
                                item.triggerHandler('mouseleave');
                            } else {
                                var prev = currButton.prevAll('.l-btn:first');
                                if (prev.length){
                                    currButton.trigger('mouseleave');
                                    prev.focus();
                                }
                            }
                            return false;
                        case 39:  // right
                            if (item.length && item[0].submenu){
                                curr.menu = $(item[0].submenu);
                                curr.button = currButton[0];
                                curr.menu.find('.menu-item:first').trigger('mouseenter');
                            } else {
                                var next = currButton.nextAll('.l-btn:first');
                                if (next.length){
                                    currButton.trigger('mouseleave');
                                    next.focus();
                                }
                            }
                            return false;
                    }
                });                        
            }
        }
    });
})(jQuery);

$(function(){
	
	//菜单栏键盘导航功能
    $.fn.menubutton.methods.enableNav();
    $(document).keydown(function(e){
        if (e.altKey && e.keyCode == 87){
            $('#btn-home').focus();
        }
    })
    
});
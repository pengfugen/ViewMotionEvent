# ViewMotionEvent
View touch事件传递流程demo代码

ViewGroup：  
三个重要的方法：dispatchTouchEvent、onInterceptTouchEvent和onTouchEvent  
(1) public boolean dispatchTouchEvent(MotionEvent event)  
touch事件从该方法开始往上(子View)传递的

(2) public boolean onInterceptTouchEvent(MotionEvent ev)  
a. 默认返回值为false，返回值为true则不会往子View传递，也就拦截了事件，会执行自己的onTouchEvent。  

(3) public boolean onTouchEvent(MotionEvent event)  
返回值不会影响子View的事件传递。  

View：  
两个重要的方法：dispatchTouchEvent和onTouchEvent。  
它们默认返回值都为true  
(1) public boolean dispatchTouchEvent(MotionEvent event)  
a.  而这个方法内部实现调用了View.OnTouchListener的onTouch方法，因此onTouch返回值会影响到dispatchTouchEvent的返回值。  
b.  假如说onTouch返回true，那么接下来dispatchTouchEvent就不会走onTouchEvent流程。  
c.  dispatchTouchEvent返回false，会执行ViewGroup的onTouchEvent，而且只会收到ACTION_DOWN事件，后面的ACTION会收不到。  

(2) public boolean onTouchEvent(MotionEvent event)  
a. onTouchEvent返回值结果也会影响dispatchTouchEvent的返回值  
b. 返回值为false(意思是不消费)，会往上传递onTouchEvent，也就是会执行ViewGroup的onTouchEvent，而且只会收到ACTION_DOWN事件，后面的ACTION会收不到。返回true则不会往上传递。也就是说dispatchTouchEvent和onTouchEvent返回false效果是一样的。  

执行View.OnClickListener流程：  
 [ (ACTION_DOWN->ACTION_MOVE->ACTION_UP) 这里要包括ViewGroup到View过程->onClick]

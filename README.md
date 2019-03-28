# 看glide源码收获

## 常用的靠谱的方法
- 1，activity.isFinishing()
 可以准备的判断出当前activity是否在销毁，Glile就是用下面这个方法来判别的,而我们的activity也只有在销毁是，isFinishing才会返回true。
 ```
 private static boolean isActivityVisible(Activity activity) {
     return !activity.isFinishing();
   }
 ```
 - 2,fragment.isVisible()
 判别fragment是否可用
 
 
 
## glide使用到的设计模式
- 1，单例模式
```
 @NonNull
  public static Glide get(@NonNull Context context) {
    if (glide == null) {
      synchronized (Glide.class) {
        if (glide == null) {
          checkAndInitializeGlide(context);
        }
      }
    }

    return glide;
  }
```
- 2,建造者模式：RequestBuilder这个类使用到了建造者模式
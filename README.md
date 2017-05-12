# EasyCopyBeanUtil
***调用源javabean的get方法，然后调用新bean的set方法，将原始bean的值copy过去,安卓可用***

usage:
```
  ExampleBean source = new ExampleBean();
  //set value
  source.set....
  source.set....
  source.set....
  ExampleBean destination = new ExampleBean();
 *** BeanCopyUtil.copy( source,destination);***
  //source -> destination
  destination.get...
```
  

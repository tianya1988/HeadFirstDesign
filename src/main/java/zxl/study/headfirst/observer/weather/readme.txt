此时，观察者每次获取到的数据是通过主题推送的
并且，观察者每次获取到的数据是主题的全部数据。不能得到观察者只关心的主题中的部分数据。

此时，观察者实现的接口,其update方法中包括了主题中的所有状态，其实应该是观察者只通过主题中公共的getter方法获取自己关心的状态。

略作修改后，请参照weatherobservable包中的代码。
package hk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8035b;

    /* renamed from: c, reason: collision with root package name */
    public String f8036c;

    public g(ArrayList arrayList) {
        this.f8034a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = bk.d.f1786b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f8035b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f8034a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) list.get(i10);
                    if (arrayList.contains(str)) {
                        this.f8036c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f8036c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f8036c = (String) objArr[0];
        return null;
    }
}

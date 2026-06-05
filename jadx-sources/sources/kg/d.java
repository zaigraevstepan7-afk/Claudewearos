package kg;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements oh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9616b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f9615a = i10;
        this.f9616b = obj;
    }

    @Override // oh.b
    public final Object get() throws ClassNotFoundException {
        switch (this.f9615a) {
            case 0:
                String str = (String) this.f9616b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new m(m1.j("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new m(m1.j("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new m(m1.i("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new m(m1.i("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f9616b;
            default:
                return new qh.b((cg.i) this.f9616b);
        }
    }
}

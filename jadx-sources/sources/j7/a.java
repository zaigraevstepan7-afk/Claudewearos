package j7;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import b3.e;
import com.anonlab.voidlauncher.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f8731d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8732e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f8735c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8734b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8733a = new HashMap();

    public a(Context context) {
        this.f8735c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f8731d == null) {
            synchronized (f8732e) {
                try {
                    if (f8731d == null) {
                        f8731d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f8731d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f8735c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f8734b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new e(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f8733a;
        if (f.H()) {
            try {
                Trace.beginSection(f.l0(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f8735c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th3) {
                throw new e(th3);
            }
        }
        Trace.endSection();
        return objB;
    }
}

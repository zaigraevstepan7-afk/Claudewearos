package kk;

import java.io.Closeable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final q f9707a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f9708b;

    static {
        q qVar;
        try {
            Class.forName("java.nio.file.Files");
            qVar = new r();
        } catch (ClassNotFoundException unused) {
            qVar = new q();
        }
        f9707a = qVar;
        String str = t.f9726b;
        String property = System.getProperty("java.io.tmpdir");
        fj.l.e(property, "getProperty(...)");
        f9708b = lh.e.f(property);
        ClassLoader classLoader = lk.f.class.getClassLoader();
        fj.l.e(classLoader, "getClassLoader(...)");
        new lk.f(classLoader);
    }

    public abstract b4.e b(t tVar);

    public abstract p e(t tVar);

    public abstract c0 g(t tVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}

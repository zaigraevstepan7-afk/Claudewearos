package lk;

import fj.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import kk.c0;
import kk.p;
import kk.q;
import kk.t;
import pi.m;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends kk.k {

    /* renamed from: f, reason: collision with root package name */
    public static final t f11012f;

    /* renamed from: c, reason: collision with root package name */
    public final ClassLoader f11013c;

    /* renamed from: d, reason: collision with root package name */
    public final kk.k f11014d;

    /* renamed from: e, reason: collision with root package name */
    public final m f11015e;

    static {
        String str = t.f9726b;
        f11012f = lh.e.f("/");
    }

    public f(ClassLoader classLoader) {
        q qVar = kk.k.f9707a;
        l.f(qVar, "systemFileSystem");
        this.f11013c = classLoader;
        this.f11014d = qVar;
        this.f11015e = v.Q(new a7.e(this, 20));
    }

    @Override // kk.k
    public final b4.e b(t tVar) {
        l.f(tVar, "path");
        if (!h9.a.g(tVar)) {
            return null;
        }
        t tVar2 = f11012f;
        tVar2.getClass();
        String strD = c.b(tVar2, tVar, true).e(tVar2).f9727a.D();
        for (pi.h hVar : (List) this.f11015e.getValue()) {
            b4.e eVarB = ((kk.k) hVar.f13000a).b(((t) hVar.f13001b).f(strD));
            if (eVarB != null) {
                return eVarB;
            }
        }
        return null;
    }

    @Override // kk.k
    public final p e(t tVar) throws FileNotFoundException {
        if (!h9.a.g(tVar)) {
            throw new FileNotFoundException("file not found: " + tVar);
        }
        t tVar2 = f11012f;
        tVar2.getClass();
        String strD = c.b(tVar2, tVar, true).e(tVar2).f9727a.D();
        for (pi.h hVar : (List) this.f11015e.getValue()) {
            try {
                return ((kk.k) hVar.f13000a).e(((t) hVar.f13001b).f(strD));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + tVar);
    }

    @Override // kk.k
    public final c0 g(t tVar) throws IOException {
        l.f(tVar, "file");
        if (!h9.a.g(tVar)) {
            throw new FileNotFoundException("file not found: " + tVar);
        }
        t tVar2 = f11012f;
        tVar2.getClass();
        URL resource = this.f11013c.getResource(c.b(tVar2, tVar, false).e(tVar2).f9727a.D());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + tVar);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        l.e(inputStream, "getInputStream(...)");
        return v.g0(inputStream);
    }
}

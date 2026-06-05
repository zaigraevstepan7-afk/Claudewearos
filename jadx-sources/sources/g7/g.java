package g7;

import android.content.Context;
import fj.l;
import pi.m;
import pi.n;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements f7.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7246b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.c f7247c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7248d;

    /* renamed from: e, reason: collision with root package name */
    public final m f7249e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7250f;

    public g(Context context, String str, f7.c cVar, boolean z2) {
        l.f(context, "context");
        l.f(cVar, "callback");
        this.f7245a = context;
        this.f7246b = str;
        this.f7247c = cVar;
        this.f7248d = z2;
        this.f7249e = v.Q(new a7.e(this, 8));
    }

    @Override // f7.e
    public final f7.b H() {
        return ((f) this.f7249e.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7249e.f13008b != n.f13010a) {
            ((f) this.f7249e.getValue()).close();
        }
    }

    @Override // f7.e
    public final String getDatabaseName() {
        return this.f7246b;
    }

    @Override // f7.e
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        if (this.f7249e.f13008b != n.f13010a) {
            ((f) this.f7249e.getValue()).setWriteAheadLoggingEnabled(z2);
        }
        this.f7250f = z2;
    }
}

package a8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: h, reason: collision with root package name */
    public static final String f198h = m.l("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final c f199g;

    public d(Context context, f8.a aVar) {
        super(context, aVar);
        this.f199g = new c(this, 0);
    }

    @Override // a8.f
    public final void d() {
        m.g().c(f198h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f205b.registerReceiver(this.f199g, f());
    }

    @Override // a8.f
    public final void e() {
        m.g().c(f198h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f205b.unregisterReceiver(this.f199g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}

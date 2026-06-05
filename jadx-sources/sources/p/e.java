package p;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f12577f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f12578z;

    public e(f fVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f12578z = fVar;
        this.f12572a = i10;
        this.f12573b = i11;
        this.f12574c = i12;
        this.f12575d = i13;
        this.f12576e = i14;
        this.f12577f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12578z.f12580b.onActivityLayout(this.f12572a, this.f12573b, this.f12574c, this.f12575d, this.f12576e, this.f12577f);
    }
}

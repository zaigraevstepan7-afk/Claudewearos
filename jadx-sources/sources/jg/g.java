package jg;

import com.google.android.gms.internal.p002firebaseauthapi.zzg;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final qd.a f8886f = new qd.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f8887a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f8888b;

    /* renamed from: c, reason: collision with root package name */
    public long f8889c;

    /* renamed from: d, reason: collision with root package name */
    public zzg f8890d;

    /* renamed from: e, reason: collision with root package name */
    public a8.e f8891e;

    public final void a() {
        f8886f.e(m1.g(this.f8887a - this.f8889c, "Scheduling refresh for "), new Object[0]);
        this.f8890d.removeCallbacks(this.f8891e);
        this.f8888b = Math.max((this.f8887a - System.currentTimeMillis()) - this.f8889c, 0L) / 1000;
        this.f8890d.postDelayed(this.f8891e, this.f8888b * 1000);
    }
}

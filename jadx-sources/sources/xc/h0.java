package xc;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzdsh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends zc.b {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f19938a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdsh f19939b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19941d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19942e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f19943f;

    public h0(g0 g0Var, boolean z2, int i10, Boolean bool, zzdsh zzdshVar) {
        this.f19938a = g0Var;
        this.f19940c = z2;
        this.f19941d = i10;
        this.f19943f = bool;
        this.f19939b = zzdshVar;
        mc.n.D.f11584k.getClass();
        this.f19942e = System.currentTimeMillis();
    }

    @Override // zc.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        mc.n nVar = mc.n.D;
        nVar.f11584k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f19942e));
        int i10 = this.f19941d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f19943f));
        boolean z2 = this.f19940c;
        u3.c.x(this.f19939b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z2 ? "0" : "1"));
        nVar.f11584k.getClass();
        this.f19938a.a(z2, new i0(null, str, ((Long) zzbfh.zzh.zze()).longValue() + System.currentTimeMillis(), i10));
    }

    @Override // zc.b
    public final void onSuccess(zc.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        mc.n nVar = mc.n.D;
        nVar.f11584k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f19942e));
        int i10 = this.f19941d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f19943f));
        boolean z2 = this.f19940c;
        u3.c.x(this.f19939b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z2 ? "0" : "1"));
        nVar.f11584k.getClass();
        this.f19938a.a(z2, new i0(aVar, "", ((Long) zzbfh.zzh.zze()).longValue() + System.currentTimeMillis(), i10));
    }
}

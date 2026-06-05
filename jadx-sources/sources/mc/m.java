package mc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzcad;
import java.util.TreeMap;
import m.e1;
import nc.a2;
import nc.b1;
import nc.c0;
import nc.g1;
import nc.i2;
import nc.l0;
import nc.l2;
import nc.n3;
import nc.o2;
import nc.q0;
import nc.q3;
import nc.s3;
import nc.v3;
import nc.w;
import nc.z;
import t.m1;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends l0 {
    public zzavs A;
    public AsyncTask B;

    /* renamed from: a, reason: collision with root package name */
    public final rc.a f11568a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f11569b;

    /* renamed from: c, reason: collision with root package name */
    public final mf.a f11570c = zzcad.zza.zzb(new h6.c(this, 1));

    /* renamed from: d, reason: collision with root package name */
    public final Context f11571d;

    /* renamed from: e, reason: collision with root package name */
    public final p f11572e;

    /* renamed from: f, reason: collision with root package name */
    public WebView f11573f;

    /* renamed from: z, reason: collision with root package name */
    public z f11574z;

    public m(Context context, s3 s3Var, String str, rc.a aVar) {
        String strConcat;
        this.f11571d = context;
        this.f11568a = aVar;
        this.f11569b = s3Var;
        this.f11573f = new WebView(context);
        p pVar = new p();
        pVar.f17053b = context.getApplicationContext();
        pVar.f17052a = str;
        pVar.f17054c = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + wd.b.a(context).d(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            int i10 = qc.l0.f13401b;
            rc.k.e("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        pVar.f17057f = strConcat;
        this.f11572e = pVar;
        n(0);
        this.f11573f.setVerticalScrollBarEnabled(false);
        this.f11573f.getSettings().setJavaScriptEnabled(true);
        this.f11573f.setWebViewClient(new l(this));
        this.f11573f.setOnTouchListener(new e1(this, 1));
    }

    public final void n(int i10) {
        if (this.f11573f == null) {
            return;
        }
        this.f11573f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // nc.m0
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzB() {
        e0.d("resume must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
        this.f11574z = zVar;
    }

    @Override // nc.m0
    public final void zzE(q0 q0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzF(s3 s3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzI(v3 v3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzK(o2 o2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzL(boolean z2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzM(zzbtx zzbtxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzO(zzbdx zzbdxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzQ(zzbua zzbuaVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzS(zzbwg zzbwgVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzU(n3 n3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final boolean zzY() {
        return false;
    }

    @Override // nc.m0
    public final boolean zzZ() {
        return false;
    }

    @Override // nc.m0
    public final boolean zzaa() {
        return false;
    }

    @Override // nc.m0
    public final boolean zzab(q3 q3Var) {
        e0.j(this.f11573f, "This Search Ad has already been torn down");
        p pVar = this.f11572e;
        TreeMap treeMap = (TreeMap) pVar.f17054c;
        pVar.f17055d = q3Var.C.f12144a;
        Bundle bundle = q3Var.F;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbeo.zzc.zze();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    pVar.f17056e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f11568a.f14321a);
            if (((Boolean) zzbeo.zza.zze()).booleanValue()) {
                Bundle bundleY = cg.b.Y((Context) pVar.f17053b, (String) zzbeo.zzb.zze());
                for (String str3 : bundleY.keySet()) {
                    treeMap.put(str3, bundleY.get(str3).toString());
                }
            }
        }
        this.B = new he.b(this).execute(new Void[0]);
        return true;
    }

    @Override // nc.m0
    public final void zzac(nc.e1 e1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // nc.m0
    public final s3 zzg() {
        return this.f11569b;
    }

    @Override // nc.m0
    public final z zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // nc.m0
    public final b1 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // nc.m0
    public final i2 zzk() {
        return null;
    }

    @Override // nc.m0
    public final l2 zzl() {
        return null;
    }

    @Override // nc.m0
    public final xd.a zzn() {
        e0.d("getAdFrame must be called on the main UI thread.");
        return new xd.b(this.f11573f);
    }

    public final String zzq() {
        String str = (String) this.f11572e.f17056e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return m1.j("https://", str, (String) zzbeo.zzd.zze());
    }

    @Override // nc.m0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // nc.m0
    public final String zzs() {
        return null;
    }

    @Override // nc.m0
    public final String zzt() {
        return null;
    }

    @Override // nc.m0
    public final void zzx() {
        e0.d("destroy must be called on the main UI thread.");
        this.B.cancel(true);
        this.f11570c.cancel(false);
        this.f11573f.destroy();
        this.f11573f = null;
    }

    @Override // nc.m0
    public final void zzz() {
        e0.d("pause must be called on the main UI thread.");
    }

    @Override // nc.m0
    public final void zzJ(g1 g1Var) {
    }

    @Override // nc.m0
    public final void zzN(boolean z2) {
    }

    @Override // nc.m0
    public final void zzP(a2 a2Var) {
    }

    @Override // nc.m0
    public final void zzW(xd.a aVar) {
    }

    @Override // nc.m0
    public final void zzy(q3 q3Var, c0 c0Var) {
    }
}

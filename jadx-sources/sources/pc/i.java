package pc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzece;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzecx;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzfvv;
import java.util.Collections;
import nc.t;
import org.json.JSONException;
import qc.l0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i extends zzbtn {
    public static final int P = Color.argb(0, 0, 0, 0);
    public WebChromeClient.CustomViewCallback A;
    public g D;
    public ah.d H;
    public boolean I;
    public boolean J;
    public Toolbar N;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f12841a;

    /* renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f12842b;

    /* renamed from: c, reason: collision with root package name */
    public zzcfe f12843c;

    /* renamed from: d, reason: collision with root package name */
    public md.m f12844d;

    /* renamed from: e, reason: collision with root package name */
    public o f12845e;

    /* renamed from: z, reason: collision with root package name */
    public FrameLayout f12847z;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12846f = false;
    public boolean B = false;
    public boolean C = false;
    public boolean E = false;
    public int O = 1;
    public final Object F = new Object();
    public final com.google.android.material.datepicker.l G = new com.google.android.material.datepicker.l(this, 3);
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;

    public i(Activity activity) {
        this.f12841a = activity;
    }

    public static final void x(View view, zzecz zzeczVar) {
        if (zzeczVar == null || view == null) {
            return;
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfw)).booleanValue() && zzeczVar.zzb()) {
            return;
        }
        mc.n.D.f11598y.zzj(zzeczVar.zza(), view);
    }

    public final void n(int i10) {
        Activity activity = this.f12841a;
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        zzbct zzbctVar = zzbdc.zzgf;
        t tVar = t.f12227d;
        if (i11 >= ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) tVar.f12230c.zzb(zzbdc.zzgg)).intValue()) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= ((Integer) tVar.f12230c.zzb(zzbdc.zzgh)).intValue()) {
                    if (i12 <= ((Integer) tVar.f12230c.zzb(zzbdc.zzgi)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            mc.n.D.f11582h.zzv(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r42) throws org.json.JSONException, pc.f {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.i.u(boolean):void");
    }

    public final void v(View view) {
        zzecz zzeczVarZzQ;
        zzecx zzecxVarZzP;
        zzcfe zzcfeVar = this.f12843c;
        if (zzcfeVar == null) {
            return;
        }
        zzbct zzbctVar = zzbdc.zzfx;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && (zzecxVarZzP = zzcfeVar.zzP()) != null) {
            zzecxVarZzP.zza(view);
        } else if (((Boolean) tVar.f12230c.zzb(zzbdc.zzfw)).booleanValue() && (zzeczVarZzQ = zzcfeVar.zzQ()) != null && zzeczVarZzQ.zzb()) {
            mc.n.D.f11598y.zzg(zzeczVarZzQ.zza(), view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(android.content.res.Configuration r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.i.w(android.content.res.Configuration):void");
    }

    public final void y(boolean z2) throws JSONException {
        if (this.f12842b.P) {
            return;
        }
        zzbct zzbctVar = zzbdc.zzfn;
        t tVar = t.f12227d;
        int iIntValue = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        boolean z10 = ((Boolean) tVar.f12230c.zzb(zzbdc.zzbl)).booleanValue() || z2;
        n nVar = new n();
        nVar.f12859a = 0;
        nVar.f12860b = 0;
        nVar.f12861c = 0;
        nVar.f12862d = 50;
        nVar.f12859a = true != z10 ? 0 : iIntValue;
        nVar.f12860b = true != z10 ? iIntValue : 0;
        nVar.f12861c = iIntValue;
        this.f12845e = new o(this.f12841a, nVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        z(z2, this.f12842b.f3447z);
        this.D.addView(this.f12845e, layoutParams);
        v(this.f12845e);
    }

    public final void z(boolean z2, boolean z10) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        mc.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        mc.j jVar2;
        zzbct zzbctVar = zzbdc.zzbj;
        t tVar = t.f12227d;
        boolean z11 = true;
        boolean z12 = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && (adOverlayInfoParcel2 = this.f12842b) != null && (jVar2 = adOverlayInfoParcel2.H) != null && jVar2.A;
        boolean z13 = ((Boolean) tVar.f12230c.zzb(zzbdc.zzbk)).booleanValue() && (adOverlayInfoParcel = this.f12842b) != null && (jVar = adOverlayInfoParcel.H) != null && jVar.B;
        if (z2 && z10 && z12 && !z13) {
            new zzbss(this.f12843c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        o oVar = this.f12845e;
        if (oVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = oVar.f12863a;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) tVar.f12230c.zzb(zzbdc.zzbn)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        m mVar;
        if (!this.f12841a.isFinishing() || this.K) {
            return;
        }
        this.K = true;
        zzcfe zzcfeVar = this.f12843c;
        if (zzcfeVar != null) {
            zzcfeVar.zzZ(this.O - 1);
            synchronized (this.F) {
                try {
                    if (!this.I && this.f12843c.zzaC()) {
                        zzbct zzbctVar = zzbdc.zzfi;
                        t tVar = t.f12227d;
                        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && !this.L && (adOverlayInfoParcel = this.f12842b) != null && (mVar = adOverlayInfoParcel.f3443c) != null) {
                            mVar.zzds();
                        }
                        ah.d dVar = new ah.d(this, 20);
                        this.H = dVar;
                        r0.f13445l.postDelayed(dVar, ((Long) tVar.f12230c.zzb(zzbdc.zzbi)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final boolean zzH() {
        this.O = 1;
        if (this.f12843c == null) {
            return true;
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue() && this.f12843c.canGoBack()) {
            this.f12843c.goBack();
            return false;
        }
        boolean zZzaH = this.f12843c.zzaH();
        if (!zZzaH) {
            this.f12843c.zzd("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzaH;
    }

    public final void zzb() {
        this.O = 3;
        Activity activity = this.f12841a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.D != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcfe zzcfeVar = this.f12843c;
        if (zzcfeVar != null) {
            zzcfeVar.zzai(null);
        }
    }

    public final void zzc() {
        zzcfe zzcfeVar;
        m mVar;
        if (this.L) {
            return;
        }
        this.L = true;
        zzcfe zzcfeVar2 = this.f12843c;
        if (zzcfeVar2 != null) {
            this.D.removeView(zzcfeVar2.zzF());
            md.m mVar2 = this.f12844d;
            if (mVar2 != null) {
                this.f12843c.zzan((Context) mVar2.f11639b);
                this.f12843c.zzaq(false);
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmS)).booleanValue() && this.f12843c.getParent() != null) {
                    ((ViewGroup) this.f12843c.getParent()).removeView(this.f12843c.zzF());
                }
                ViewGroup viewGroup = (ViewGroup) this.f12844d.f11641d;
                View viewZzF = this.f12843c.zzF();
                md.m mVar3 = this.f12844d;
                viewGroup.addView(viewZzF, mVar3.f11638a, (ViewGroup.LayoutParams) mVar3.f11640c);
                this.f12844d = null;
            } else {
                Activity activity = this.f12841a;
                if (activity.getApplicationContext() != null) {
                    this.f12843c.zzan(activity.getApplicationContext());
                }
            }
            this.f12843c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f3443c) != null) {
            mVar.zzdw(this.O);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f12842b;
        if (adOverlayInfoParcel2 == null || (zzcfeVar = adOverlayInfoParcel2.f3444d) == null) {
            return;
        }
        x(this.f12842b.f3444d.zzF(), zzcfeVar.zzQ());
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel != null && this.f12846f) {
            n(adOverlayInfoParcel.C);
        }
        if (this.f12847z != null) {
            this.f12841a.setContentView(this.D);
            this.J = true;
            this.f12847z.removeAllViews();
            this.f12847z = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.A;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.A = null;
        }
        this.f12846f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzh(int i10, int i11, Intent intent) {
        zzdsc zzdscVarZze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            zzbct zzbctVar = zzbdc.zznn;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                l0.k("Callback from intent launch with requestCode: 236 and resultCode: " + i11);
                zzcfe zzcfeVar = this.f12843c;
                if (zzcfeVar == null || zzcfeVar.zzN() == null || (zzdscVarZze = zzcfeVar.zzN().zze()) == null || (adOverlayInfoParcel = this.f12842b) == null || !((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    return;
                }
                zzdsb zzdsbVarZza = zzdscVarZze.zza();
                zzdsbVarZza.zzb("action", "hilca");
                zzdsbVarZza.zzb("gqi", zzfvv.zzc(adOverlayInfoParcel.J));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                zzdsbVarZza.zzb("hilr", sb2.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdsbVarZza.zzb("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdsbVarZza.zzb("hills", stringExtra2);
                    }
                }
                zzdsbVarZza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzi() {
        this.O = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzk(xd.a aVar) {
        w((Configuration) xd.b.u(aVar));
    }

    public void zzl(Bundle bundle) throws JSONException, f {
        boolean z2 = this.J;
        Activity activity = this.f12841a;
        if (!z2) {
            activity.requestWindowFeature(1);
        }
        this.B = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.b(activity.getIntent());
            this.f12842b = adOverlayInfoParcelB;
            if (adOverlayInfoParcelB == null) {
                throw new f("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelB.P) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f12842b.F.f14323c > 7500000) {
                this.O = 4;
            }
            if (activity.getIntent() != null) {
                this.M = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
            mc.j jVar = adOverlayInfoParcel.H;
            int i10 = adOverlayInfoParcel.D;
            if (jVar != null) {
                boolean z10 = jVar.f11560a;
                this.C = z10;
                if (z10) {
                    if (i10 != 5 && jVar.f11565f != -1) {
                        new h(this).zzb();
                    }
                }
            } else if (i10 == 5) {
                this.C = true;
                if (i10 != 5) {
                    new h(this).zzb();
                }
            } else {
                this.C = false;
            }
            if (bundle == null) {
                if (this.M) {
                    zzcwe zzcweVar = this.f12842b.M;
                    if (zzcweVar != null) {
                        zzcweVar.zzb();
                    }
                    m mVar = this.f12842b.f3443c;
                    if (mVar != null) {
                        mVar.zzdt();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f12842b;
                if (adOverlayInfoParcel2.D != 1) {
                    nc.a aVar = adOverlayInfoParcel2.f3442b;
                    if (aVar != null) {
                        aVar.onAdClicked();
                    }
                    zzddw zzddwVar = this.f12842b.N;
                    if (zzddwVar != null) {
                        zzddwVar.zzdf();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f12842b;
            g gVar = new g(activity, adOverlayInfoParcel3.G, adOverlayInfoParcel3.F.f14321a, adOverlayInfoParcel3.L);
            this.D = gVar;
            gVar.setId(zzbch.zzq.zzf);
            mc.n.D.f11580f.b(activity);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f12842b;
            int i11 = adOverlayInfoParcel4.D;
            if (i11 == 1) {
                u(false);
                return;
            }
            if (i11 == 2) {
                this.f12844d = new md.m(adOverlayInfoParcel4.f3444d);
                u(false);
            } else if (i11 == 3) {
                u(true);
            } else {
                if (i11 != 5) {
                    throw new f("Could not determine ad overlay type.");
                }
                u(false);
            }
        } catch (f e10) {
            String message = e10.getMessage();
            int i12 = l0.f13401b;
            rc.k.g(message);
            this.O = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzm() {
        zzcfe zzcfeVar = this.f12843c;
        if (zzcfeVar != null) {
            try {
                this.D.removeView(zzcfeVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzo() {
        m mVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f3443c) != null) {
            mVar.zzdk();
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfk)).booleanValue() && this.f12843c != null && (!this.f12841a.isFinishing() || this.f12844d == null)) {
            this.f12843c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            zzece zzeceVarZze = zzecf.zze();
            zzeceVarZze.zza(this.f12841a);
            zzeceVarZze.zzb(this.f12842b.D == 5 ? this : null);
            try {
                this.f12842b.O.zzf(strArr, iArr, new xd.b(zzeceVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzr() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f3443c) != null) {
            mVar.zzdH();
        }
        w(this.f12841a.getResources().getConfiguration());
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfk)).booleanValue()) {
            return;
        }
        zzcfe zzcfeVar = this.f12843c;
        if (zzcfeVar != null && !zzcfeVar.zzaE()) {
            this.f12843c.onResume();
        } else {
            int i10 = l0.f13401b;
            rc.k.g("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.B);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzt() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfk)).booleanValue()) {
            zzcfe zzcfeVar = this.f12843c;
            if (zzcfeVar != null && !zzcfeVar.zzaE()) {
                this.f12843c.onResume();
            } else {
                int i10 = l0.f13401b;
                rc.k.g("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzu() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfk)).booleanValue() && this.f12843c != null && (!this.f12841a.isFinishing() || this.f12844d == null)) {
            this.f12843c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzv() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12842b;
        if (adOverlayInfoParcel == null || (mVar = adOverlayInfoParcel.f3443c) == null) {
            return;
        }
        mVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzx() {
        this.J = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzq() {
    }
}

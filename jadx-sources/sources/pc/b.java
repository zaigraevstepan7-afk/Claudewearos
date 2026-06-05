package pc;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzddw;
import nc.t;
import qc.l0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends zzbtn implements zzazu {

    /* renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f12823a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f12824b;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12828f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12825c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12826d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12827e = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12829z = false;
    public boolean A = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z2 = false;
        this.f12823a = adOverlayInfoParcel;
        this.f12824b = activity;
        zzbct zzbctVar = zzbdc.zzeU;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if ((((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue() || ((Boolean) zzbdaVar2.zzb(zzbdc.zzeV)).booleanValue() || ((Boolean) zzbdaVar2.zzb(zzbdc.zzeZ)).booleanValue()) && (eVar = adOverlayInfoParcel.f3441a) != null && eVar.C && Build.MANUFACTURER.matches((String) zzbdaVar2.zzb(zzbdc.zzeX)) && Build.MODEL.matches((String) zzbdaVar2.zzb(zzbdc.zzeY))) {
            z2 = true;
        }
        this.f12828f = z2;
    }

    public final synchronized void n() {
        try {
            if (!this.f12826d) {
                m mVar = this.f12823a.f3443c;
                if (mVar != null) {
                    mVar.zzdw(4);
                }
                this.f12826d = true;
                if (this.f12828f) {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeZ)).booleanValue()) {
                        mc.n.D.f11581g.zze(this);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final boolean zzH() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeV)).booleanValue() && this.f12828f && this.f12829z;
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final void zza(boolean z2) {
        if (!z2) {
            this.A = true;
        } else if (this.A) {
            int i10 = l0.f13401b;
            rc.k.b("Foregrounded: finishing activity from LauncherOverlay");
            this.f12824b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzl(Bundle bundle) {
        m mVar;
        zzbct zzbctVar = zzbdc.zzje;
        t tVar = t.f12227d;
        boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue();
        Activity activity = this.f12824b;
        if (zBooleanValue && !this.f12827e) {
            activity.requestWindowFeature(1);
        }
        boolean z2 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z2 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f12823a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z2) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            nc.a aVar = adOverlayInfoParcel.f3442b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            zzddw zzddwVar = adOverlayInfoParcel.N;
            if (zzddwVar != null) {
                zzddwVar.zzdf();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (mVar = adOverlayInfoParcel.f3443c) != null) {
                mVar.zzdt();
            }
        }
        if (this.f12828f) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzeZ)).booleanValue()) {
                mc.n.D.f11581g.zzc(this);
            }
        }
        e eVar = adOverlayInfoParcel.f3441a;
        c cVar = adOverlayInfoParcel.B;
        lh.e eVar2 = mc.n.D.f11575a;
        a aVar2 = eVar.B;
        Activity activity2 = this.f12824b;
        if (lh.e.h(activity2, eVar, cVar, aVar2, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzm() {
        if (this.f12824b.isFinishing()) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzo() {
        this.f12829z = false;
        m mVar = this.f12823a.f3443c;
        if (mVar != null) {
            mVar.zzdk();
        }
        if (this.f12824b.isFinishing()) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzr() {
        if (this.f12825c) {
            l0.k("LauncherOverlay finishing activity");
            this.f12824b.finish();
            return;
        }
        this.f12825c = true;
        this.f12829z = true;
        m mVar = this.f12823a.f3443c;
        if (mVar != null) {
            mVar.zzdH();
        }
        if (this.f12828f) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeU)).booleanValue()) {
                r0.f13445l.postDelayed(new ah.d(this, 19), ((Integer) r1.f12230c.zzb(zzbdc.zzeW)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f12825c);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzu() {
        if (this.f12824b.isFinishing()) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzv() {
        m mVar = this.f12823a.f3443c;
        if (mVar != null) {
            mVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzx() {
        this.f12827e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzk(xd.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }
}

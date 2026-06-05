package nc;

import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f12095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12096c;

    public c(p pVar, AdActivity adActivity) {
        this.f12095b = adActivity;
        this.f12096c = pVar;
    }

    @Override // nc.r
    public final /* bridge */ /* synthetic */ Object a() {
        p.k(this.f12095b, "ad_overlay");
        return null;
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.zzn(new xd.b(this.f12095b));
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        AdActivity adActivity = this.f12095b;
        zzbdc.zza(adActivity);
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue();
        p pVar = this.f12096c;
        if (!zBooleanValue) {
            return ((zzbtl) pVar.f12165e).zza(adActivity);
        }
        try {
            try {
                return zzbtn.zzI(zzbtq.zzb(a.a.e0(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl")).zze(new xd.b(adActivity)));
            } catch (Exception e10) {
                throw new rc.m(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            zzbun zzbunVarZza = zzbul.zza(adActivity.getApplicationContext());
            pVar.f12166f = zzbunVarZza;
            zzbunVarZza.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbun zzbunVarZza2 = zzbul.zza(adActivity.getApplicationContext());
            pVar.f12166f = zzbunVarZza2;
            zzbunVarZza2.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (rc.m e13) {
            e = e13;
            zzbun zzbunVarZza22 = zzbul.zza(adActivity.getApplicationContext());
            pVar.f12166f = zzbunVarZza22;
            zzbunVarZza22.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}

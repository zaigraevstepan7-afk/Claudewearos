package nc;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wc.i f12154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f12156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f12157e;

    public o(p pVar, wc.i iVar, FrameLayout frameLayout, Context context) {
        this.f12154b = iVar;
        this.f12155c = frameLayout;
        this.f12156d = context;
        this.f12157e = pVar;
    }

    @Override // nc.r
    public final Object a() {
        p.k(this.f12156d, "native_ad_view_delegate");
        return new f3();
    }

    @Override // nc.r
    public final Object b(d1 d1Var) {
        return d1Var.t(new xd.b(this.f12154b), new xd.b(this.f12155c));
    }

    @Override // nc.r
    public final Object c() throws rc.m {
        Context context = this.f12156d;
        zzbdc.zza(context);
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue();
        p pVar = this.f12157e;
        FrameLayout frameLayout = this.f12155c;
        wc.i iVar = this.f12154b;
        if (!zBooleanValue) {
            return ((zzbij) pVar.f12164d).zza(context, iVar, frameLayout);
        }
        try {
            try {
                return zzbgq.zzdC(zzbgt.zzb(a.a.e0(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl")).zze(new xd.b(context), new xd.b(iVar), new xd.b(frameLayout), ModuleDescriptor.MODULE_VERSION));
            } catch (Exception e10) {
                throw new rc.m(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            zzbun zzbunVarZza = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza;
            zzbunVarZza.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzbun zzbunVarZza2 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza2;
            zzbunVarZza2.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (rc.m e13) {
            e = e13;
            zzbun zzbunVarZza22 = zzbul.zza(context);
            pVar.f12166f = zzbunVarZza22;
            zzbunVarZza22.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}

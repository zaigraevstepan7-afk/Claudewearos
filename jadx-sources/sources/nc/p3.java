package nc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p3 extends xd.d {

    /* renamed from: a, reason: collision with root package name */
    public zzbun f12179a;

    public final m0 a(Context context, s3 s3Var, String str, zzbpo zzbpoVar, int i10) throws rc.m {
        n0 n0Var;
        s3 s3Var2;
        String str2;
        zzbpo zzbpoVar2;
        int i11;
        zzbdc.zza(context);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkU)).booleanValue()) {
            try {
                xd.b bVar = new xd.b(context);
                try {
                    IBinder iBinderB = a.a.e0(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        s3Var2 = s3Var;
                        str2 = str;
                        zzbpoVar2 = zzbpoVar;
                        i11 = i10;
                        n0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        n0Var = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(iBinderB);
                        s3Var2 = s3Var;
                        str2 = str;
                        zzbpoVar2 = zzbpoVar;
                        i11 = i10;
                    }
                    IBinder iBinderN = n0Var.n(bVar, s3Var2, str2, zzbpoVar2, i11);
                    if (iBinderN != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderN.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof m0 ? (m0) iInterfaceQueryLocalInterface2 : new k0(iBinderN);
                    }
                } catch (Exception e10) {
                    throw new rc.m(e10);
                }
            } catch (RemoteException e11) {
                e = e11;
                Exception exc = e;
                zzbun zzbunVarZza = zzbul.zza(context);
                this.f12179a = zzbunVarZza;
                zzbunVarZza.zzh(exc, "AdManagerCreator.newAdManagerByDynamiteLoader");
                rc.k.i("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Exception exc2 = e;
                zzbun zzbunVarZza2 = zzbul.zza(context);
                this.f12179a = zzbunVarZza2;
                zzbunVarZza2.zzh(exc2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                rc.k.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (rc.m e13) {
                e = e13;
                Exception exc22 = e;
                zzbun zzbunVarZza22 = zzbul.zza(context);
                this.f12179a = zzbunVarZza22;
                zzbunVarZza22.zzh(exc22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                rc.k.i("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderN2 = ((n0) getRemoteCreatorInstance(context)).n(new xd.b(context), s3Var, str, zzbpoVar, i10);
                if (iBinderN2 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderN2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof m0 ? (m0) iInterfaceQueryLocalInterface3 : new k0(iBinderN2);
                }
            } catch (RemoteException e14) {
                e = e14;
                rc.k.c("Could not create remote AdManager.", e);
                return null;
            } catch (xd.c e15) {
                e = e15;
                rc.k.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }

    @Override // xd.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }
}

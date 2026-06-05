package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import rc.k;
import rc.l;
import rc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxf {
    public static final zzbwt zza(Context context, String str, zzbpo zzbpoVar) {
        try {
            IBinder iBinderZze = ((zzbwx) a.a.d0(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new l() { // from class: com.google.android.gms.internal.ads.zzbxe
                @Override // rc.l
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbwx ? (zzbwx) iInterfaceQueryLocalInterface : new zzbwx(iBinder);
                }
            })).zze(new xd.b(context), str, zzbpoVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface : new zzbwr(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            k.i("#007 Could not call remote method.", e);
            return null;
        } catch (m e11) {
            e = e11;
            k.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}

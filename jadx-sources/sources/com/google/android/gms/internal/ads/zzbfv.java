package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import rc.k;
import rc.l;
import rc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbfv {
    private final Context zza;

    public zzbfv(Context context) {
        this.zza = context;
    }

    public final void zza(zzbus zzbusVar) {
        try {
            ((zzbfw) a.a.d0(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new l() { // from class: com.google.android.gms.internal.ads.zzbfu
                @Override // rc.l
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfw(iBinder);
                }
            })).zze(zzbusVar);
        } catch (RemoteException e10) {
            k.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (m e11) {
            k.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}

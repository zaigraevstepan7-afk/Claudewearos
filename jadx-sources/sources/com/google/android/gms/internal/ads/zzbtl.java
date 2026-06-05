package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtl extends xd.d {
    public zzbtl() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // xd.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbtr ? (zzbtr) iInterfaceQueryLocalInterface : new zzbtp(iBinder);
    }

    public final zzbto zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbtr) getRemoteCreatorInstance(activity)).zze(new xd.b(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbto ? (zzbto) iInterfaceQueryLocalInterface : new zzbtm(iBinderZze);
        } catch (RemoteException e10) {
            k.h("Could not create remote AdOverlay.", e10);
            return null;
        } catch (xd.c e11) {
            k.h("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}

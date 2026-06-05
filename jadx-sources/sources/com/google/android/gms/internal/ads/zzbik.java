package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbik extends xd.d {
    public zzbik() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // xd.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbha ? (zzbha) iInterfaceQueryLocalInterface : new zzbgy(iBinder);
    }

    public final zzbgx zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((zzbha) getRemoteCreatorInstance(view.getContext())).zze(new xd.b(view), new xd.b(map), new xd.b(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface : new zzbgv(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            k.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (xd.c e11) {
            e = e11;
            k.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}

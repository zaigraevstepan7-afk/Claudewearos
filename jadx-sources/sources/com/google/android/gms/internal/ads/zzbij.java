package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbij extends xd.d {
    public zzbij() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // xd.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbgu ? (zzbgu) iInterfaceQueryLocalInterface : new zzbgs(iBinder);
    }

    public final zzbgr zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((zzbgu) getRemoteCreatorInstance(context)).zze(new xd.b(context), new xd.b(frameLayout), new xd.b(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbgr ? (zzbgr) iInterfaceQueryLocalInterface : new zzbgp(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            k.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (xd.c e11) {
            e = e11;
            k.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}

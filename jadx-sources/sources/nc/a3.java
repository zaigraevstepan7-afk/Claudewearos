package nc;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a3 extends xd.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(String str, int i10) {
        super(str);
        this.f12090a = i10;
    }

    @Override // xd.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        switch (this.f12090a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new n1(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface2 instanceof j0 ? (j0) iInterfaceQueryLocalInterface2 : new j0(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface3 instanceof y0 ? (y0) iInterfaceQueryLocalInterface3 : new y0(iBinder);
        }
    }
}

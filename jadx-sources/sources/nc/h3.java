package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h3 extends zzays implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final ad.a f12119a;

    public h3(ad.a aVar) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.f12119a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }

    @Override // nc.y1
    public final void zze() {
        ad.a aVar = this.f12119a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}

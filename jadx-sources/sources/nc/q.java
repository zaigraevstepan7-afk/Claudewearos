package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends zzays implements w {

    /* renamed from: a, reason: collision with root package name */
    public final a f12180a;

    public q(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f12180a = aVar;
    }

    @Override // nc.w
    public final void zzb() {
        this.f12180a.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}

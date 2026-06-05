package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x2 extends zzays implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12258b;

    public x2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f12257a = str;
        this.f12258b = str2;
    }

    public static s1 n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof s1 ? (s1) iInterfaceQueryLocalInterface : new r1(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f12257a);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f12258b);
        }
        return true;
    }

    @Override // nc.s1
    public final String zze() {
        return this.f12257a;
    }

    @Override // nc.s1
    public final String zzf() {
        return this.f12258b;
    }
}

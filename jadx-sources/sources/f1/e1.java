package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6285a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6285a) {
            case 0:
                return new f1(parcel.readFloat());
            case 1:
                return new g1(parcel.readInt());
            default:
                return new h1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f6285a) {
            case 0:
                return new f1[i10];
            case 1:
                return new g1[i10];
            default:
                return new h1[i10];
        }
    }
}

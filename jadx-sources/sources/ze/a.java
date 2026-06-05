package ze;

import android.os.Parcel;
import android.os.Parcelable;
import t1.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends k5.b {
    public static final Parcelable.Creator<a> CREATOR = new p(10);

    /* renamed from: c, reason: collision with root package name */
    public boolean f20498c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20498c = parcel.readInt() == 1;
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f20498c ? 1 : 0);
    }
}

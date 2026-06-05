package f4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import t1.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends k5.b {
    public static final Parcelable.Creator<f> CREATOR = new p(1);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f6638c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f6638c = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6638c.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f6638c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f6638c.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f6638c.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}

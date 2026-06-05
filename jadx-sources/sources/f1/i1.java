package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 implements Parcelable.ClassLoaderCreator {
    public static j1 a(Parcel parcel, ClassLoader classLoader) {
        f fVar;
        if (classLoader == null) {
            classLoader = i1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            fVar = f.f6290d;
        } else if (i10 == 1) {
            fVar = f.f6293z;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(m6.a.e(i10, "Unsupported MutableState policy ", " was restored"));
            }
            fVar = f.f6291e;
        }
        return new j1(value, fVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new j1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}

package t1;

import android.os.Parcel;
import android.os.Parcelable;
import m.z1;
import t6.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15481a;

    public /* synthetic */ p(int i10) {
        this.f15481a = i10;
    }

    public static q a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        if (i10 == 0) {
            return new q();
        }
        l1.f fVarX = l1.i.f9872b.x();
        for (int i11 = 0; i11 < i10; i11++) {
            fVarX.add(parcel.readValue(classLoader));
        }
        return new q(fVarX.i());
    }

    public static w b(Parcel parcel, ClassLoader classLoader) {
        w wVar = new w();
        if (classLoader == null) {
            classLoader = w.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            wVar.add(parcel.readValue(classLoader));
        }
        return wVar;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f15481a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new f4.f(parcel, classLoader);
            case 2:
                return new ff.e(parcel, classLoader);
            case 3:
                return new hf.b0(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return k5.b.f9453b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new z1(parcel, classLoader);
            case 6:
                return new re.a(parcel, classLoader);
            case 7:
                return new se.c(parcel, classLoader);
            case 8:
                return b(parcel, classLoader);
            case 9:
                return new n0(parcel, classLoader);
            default:
                return new ze.a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f15481a) {
            case 0:
                return new q[i10];
            case 1:
                return new f4.f[i10];
            case 2:
                return new ff.e[i10];
            case 3:
                return new hf.b0[i10];
            case 4:
                return new k5.b[i10];
            case 5:
                return new z1[i10];
            case 6:
                return new re.a[i10];
            case 7:
                return new se.c[i10];
            case 8:
                return new w[i10];
            case 9:
                return new n0[i10];
            default:
                return new ze.a[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15481a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new f4.f(parcel, null);
            case 2:
                return new ff.e(parcel, null);
            case 3:
                return new hf.b0(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return k5.b.f9453b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new z1(parcel, null);
            case 6:
                return new re.a(parcel, null);
            case 7:
                return new se.c(parcel, null);
            case 8:
                return b(parcel, null);
            case 9:
                return new n0(parcel, null);
            default:
                return new ze.a(parcel, null);
        }
    }
}

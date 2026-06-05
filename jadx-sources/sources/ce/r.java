package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new x0(9);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f3308a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(a aVar) {
        this.f3308a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r a(int i10) throws q {
        g0 g0Var;
        if (i10 == -262) {
            g0Var = g0.RS1;
        } else {
            g0[] g0VarArrValues = g0.values();
            int length = g0VarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (s sVar : s.values()) {
                        if (sVar.f3311a == i10) {
                            g0Var = sVar;
                        }
                    }
                    throw new q(m6.a.e(i10, "Algorithm with COSE value ", " not supported"));
                }
                g0 g0Var2 = g0VarArrValues[i11];
                if (g0Var2.f3269a == i10) {
                    g0Var = g0Var2;
                    break;
                }
                i11++;
            }
        }
        return new r(g0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ce.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ce.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f3308a.a() == ((r) obj).f3308a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3308a});
    }

    public final String toString() {
        return m1.j("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f3308a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ce.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3308a.a());
    }
}

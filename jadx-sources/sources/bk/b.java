package bk;

import f0.e1;
import f0.h0;
import f1.o0;
import fj.l;
import java.util.Comparator;
import kj.h;
import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1782a;

    public /* synthetic */ b(int i10) {
        this.f1782a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1782a) {
            case 0:
                return ((String) obj).compareTo((String) obj2);
            case 1:
                return l.h(((e1) obj2).f6135a, ((e1) obj).f6135a);
            case 2:
                return l.h(((h0) obj).getIndex(), ((h0) obj2).getIndex());
            case 3:
                return l.h(((o0) obj).f6403b, ((o0) obj2).f6403b);
            case 4:
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                return (hVar.f9666b - hVar.f9665a) - (hVar2.f9666b - hVar2.f9665a);
            case 5:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                float f10 = f0Var.Z.f17703p.X;
                float f11 = f0Var2.Z.f17703p.X;
                return f10 == f11 ? l.h(f0Var.v(), f0Var2.v()) : Float.compare(f10, f11);
        }
    }
}

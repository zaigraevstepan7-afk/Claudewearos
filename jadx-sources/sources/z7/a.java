package z7;

import a8.f;
import android.os.Build;
import c8.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i10) {
        super(fVar);
        this.f20460e = i10;
    }

    @Override // z7.c
    public final boolean a(i iVar) {
        switch (this.f20460e) {
            case 0:
                return iVar.j.f16103b;
            case 1:
                return iVar.j.f16105d;
            case 2:
                return iVar.j.f16102a == 2;
            case 3:
                int i10 = iVar.j.f16102a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                return iVar.j.f16106e;
        }
    }

    @Override // z7.c
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f20460e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                y7.a aVar = (y7.a) obj;
                return (aVar.f20228a && aVar.f20229b) ? false : true;
            case 3:
                y7.a aVar2 = (y7.a) obj;
                return !aVar2.f20228a || aVar2.f20230c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}

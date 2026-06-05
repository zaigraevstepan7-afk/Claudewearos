package g1;

import pi.o;
import q.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.h implements ej.e {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ Object E;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7027b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f7028c;

    /* renamed from: d, reason: collision with root package name */
    public int f7029d;

    /* renamed from: e, reason: collision with root package name */
    public int f7030e;

    /* renamed from: f, reason: collision with root package name */
    public int f7031f;

    /* renamed from: z, reason: collision with root package name */
    public int f7032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ti.c cVar, int i10) {
        super(cVar);
        this.f7027b = i10;
        this.E = obj;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7027b) {
            case 0:
                g gVar = new g((h) this.E, cVar, 0);
                gVar.C = obj;
                return gVar;
            case 1:
                g gVar2 = new g((q.h) this.E, cVar, 1);
                gVar2.C = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((q.h) this.E, cVar, 2);
                gVar3.C = obj;
                return gVar3;
            default:
                g gVar4 = new g((r0) this.E, cVar, 3);
                gVar4.C = obj;
                return gVar4;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        mj.g gVar = (mj.g) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7027b) {
        }
        return ((g) create(gVar, cVar)).invokeSuspend(o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006e -> B:23:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0070 -> B:16:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0106 -> B:45:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0108 -> B:38:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011f -> B:42:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01a7 -> B:68:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:60:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ef -> B:65:0x01f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0257 -> B:85:0x0268). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x026e -> B:76:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x029a -> B:94:0x029b). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

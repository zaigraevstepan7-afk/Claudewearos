package d1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import v.f1;
import v.j1;
import w2.r2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.i implements ej.e {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4536a = 5;

    /* renamed from: b, reason: collision with root package name */
    public int f4537b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4538c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4539d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4540e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4541f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4542z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ContentResolver contentResolver, Uri uri, r2 r2Var, sj.c cVar, Context context, ti.c cVar2) {
        super(2, cVar2);
        this.f4540e = contentResolver;
        this.f4541f = uri;
        this.f4542z = r2Var;
        this.A = cVar;
        this.B = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ej.c, vi.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ej.c, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4536a) {
            case 0:
                m0 m0Var = new m0((f1) this.A, (n0) this.f4542z, (ej.c) this.B, cVar);
                m0Var.f4540e = obj;
                return m0Var;
            case 1:
                m0 m0Var2 = new m0((String) this.f4541f, (c.m) this.f4542z, (f1.a1) this.A, (f1.a1) this.B, cVar);
                m0Var2.f4538c = obj;
                return m0Var2;
            case 2:
                return new m0((n8.f) this.f4539d, (fj.v) this.f4540e, (fj.v) this.f4541f, (r8.g) this.f4542z, this.f4538c, (fj.v) this.A, (h8.f) this.B, cVar);
            case 3:
                return new m0((n8.f) this.f4539d, (r8.g) this.f4540e, this.f4538c, (r8.n) this.f4541f, (h8.f) this.f4542z, (q8.a) this.A, (n8.i) this.B, cVar);
            case 4:
                m0 m0Var3 = new m0((f1) this.A, (j1) this.f4542z, (ej.c) this.B, cVar);
                m0Var3.f4540e = obj;
                return m0Var3;
            default:
                m0 m0Var4 = new m0((ContentResolver) this.f4540e, (Uri) this.f4541f, (r2) this.f4542z, (sj.c) this.A, (Context) this.B, cVar);
                m0Var4.f4538c = obj;
                return m0Var4;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4536a) {
            case 0:
                return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 3:
                return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 4:
                return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((m0) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #9 {all -> 0x002d, blocks: (B:9:0x0027, B:20:0x005e, B:24:0x0070, B:26:0x0078, B:16:0x0040, B:19:0x0055), top: B:255:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ui.a, yj.a] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, ui.a, yj.a] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v20, types: [ej.c] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v7, types: [ej.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009f -> B:20:0x005e). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, c.m mVar, f1.a1 a1Var, f1.a1 a1Var2, ti.c cVar) {
        super(2, cVar);
        this.f4541f = str;
        this.f4542z = mVar;
        this.A = a1Var;
        this.B = a1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n8.f fVar, fj.v vVar, fj.v vVar2, r8.g gVar, Object obj, fj.v vVar3, h8.f fVar2, ti.c cVar) {
        super(2, cVar);
        this.f4539d = fVar;
        this.f4540e = vVar;
        this.f4541f = vVar2;
        this.f4542z = gVar;
        this.f4538c = obj;
        this.A = vVar3;
        this.B = fVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n8.f fVar, r8.g gVar, Object obj, r8.n nVar, h8.f fVar2, q8.a aVar, n8.i iVar, ti.c cVar) {
        super(2, cVar);
        this.f4539d = fVar;
        this.f4540e = gVar;
        this.f4538c = obj;
        this.f4541f = nVar;
        this.f4542z = fVar2;
        this.A = aVar;
        this.B = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(f1 f1Var, n0 n0Var, ej.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.A = f1Var;
        this.f4542z = n0Var;
        this.B = (vi.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(f1 f1Var, j1 j1Var, ej.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.A = f1Var;
        this.f4542z = j1Var;
        this.B = (vi.i) cVar;
    }
}

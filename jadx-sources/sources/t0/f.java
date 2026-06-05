package t0;

import android.view.View;
import android.view.textclassifier.TextClassifier;
import com.google.android.gms.internal.ads.zzbch;
import f1.a2;
import f1.q2;
import fj.v;
import qj.e1;
import tj.p0;
import u6.n0;
import v.f1;
import w2.i0;
import w2.o1;
import w2.w1;
import w3.x;
import w6.y;
import w6.z;
import x.e2;
import x.k1;
import x.n1;
import x.r1;
import x.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15354a;

    /* renamed from: b, reason: collision with root package name */
    public int f15355b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(TextClassifier textClassifier, ej.e eVar, ti.c cVar) {
        super(2, cVar);
        this.f15354a = 7;
        this.f15356c = textClassifier;
        this.f15357d = (vi.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ej.e, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        int i10 = this.f15354a;
        Object obj2 = this.f15357d;
        switch (i10) {
            case 0:
                return new f((e1) this.f15356c, (g) obj2, cVar, 0);
            case 1:
                return new f((l) this.f15356c, (ab.q) obj2, cVar, 1);
            case 2:
                f fVar = new f((ej.c) obj2, cVar, 2);
                fVar.f15356c = obj;
                return fVar;
            case 3:
                return new f((n0) this.f15356c, (ej.a) obj2, cVar, 3);
            case 4:
                f fVar2 = new f((tj.f) obj2, cVar, 4);
                fVar2.f15356c = obj;
                return fVar2;
            case 5:
                return new f((z.k) this.f15356c, (z.h) obj2, cVar, 5);
            case 6:
                return new f((z.k) this.f15356c, (z.i) obj2, cVar, 6);
            case 7:
                return new f((TextClassifier) this.f15356c, (ej.e) obj2, cVar);
            case 8:
                return new f((v3.o) this.f15356c, (b2.c) obj2, cVar, 8);
            case 9:
                f fVar3 = new f((i0) obj2, cVar, 9);
                fVar3.f15356c = obj;
                return fVar3;
            case 10:
                return new f((p0) this.f15356c, (w1) obj2, cVar, 10);
            case 11:
                return new f((a2) this.f15356c, (View) obj2, cVar, 11);
            case 12:
                f fVar4 = new f((x) obj2, cVar, 12);
                fVar4.f15356c = obj;
                return fVar4;
            case 13:
                return new f((ej.e) this.f15356c, (y) obj2, cVar, 13);
            case 14:
                return new f((ej.e) this.f15356c, (v) obj2, cVar, 14);
            case 15:
                return new f((ej.e) this.f15356c, cVar, (w6.m) obj2);
            case 16:
                return new f((g0.d) this.f15356c, (ej.c) obj2, cVar, 16);
            case 17:
                return new f((t.c) this.f15356c, (q2) obj2, cVar, 17);
            case 18:
                x.k kVar = (x.k) this.f15356c;
                f1 f1Var = f1.f17189a;
                return new f(kVar, (z) obj2, cVar);
            case 19:
                f fVar5 = new f((k1) obj2, cVar, 19);
                fVar5.f15356c = obj;
                return fVar5;
            case 20:
                return new f((n1) this.f15356c, (ej.e) obj2, cVar, 20);
            case zzbch.zzt.zzm /* 21 */:
                f fVar6 = new f((sj.g) obj2, cVar, 21);
                fVar6.f15356c = obj;
                return fVar6;
            case 22:
                return new f((w) this.f15356c, (e2) obj2, cVar, 22);
            default:
                return new f((e1) this.f15356c, (r1) obj2, cVar, 23);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15354a) {
            case 0:
                ((f) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
            case 1:
                ((f) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
            case 9:
                ((f) create((o1) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
            case 10:
                ((f) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
        }
        return ((f) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x0612, code lost:
    
        if (qj.b0.i(500, r12) != r0) goto L365;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0607 A[Catch: all -> 0x05b9, TryCatch #4 {all -> 0x05b9, blocks: (B:338:0x05b5, B:365:0x0615, B:359:0x05fe, B:362:0x0607, B:344:0x05c3, B:345:0x05c7, B:346:0x05cf, B:356:0x05ef, B:358:0x05f8), top: B:377:0x05ab }] */
    /* JADX WARN: Removed duplicated region for block: B:384:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Type inference failed for: r1v106, types: [int] */
    /* JADX WARN: Type inference failed for: r1v107, types: [qj.e1] */
    /* JADX WARN: Type inference failed for: r1v111, types: [qj.e1] */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v78, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r3v12, types: [ej.e, vi.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x02fb -> B:173:0x02fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x0612 -> B:365:0x0615). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0166 -> B:80:0x012d). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(ej.e eVar, ti.c cVar, w6.m mVar) {
        super(2, cVar);
        this.f15354a = 15;
        this.f15356c = (vi.i) eVar;
        this.f15357d = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f15354a = i10;
        this.f15356c = obj;
        this.f15357d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f15354a = i10;
        this.f15357d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x.k kVar, z zVar, ti.c cVar) {
        super(2, cVar);
        this.f15354a = 18;
        f1 f1Var = f1.f17189a;
        this.f15356c = kVar;
        this.f15357d = zVar;
    }
}

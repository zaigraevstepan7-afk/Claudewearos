package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f19530a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (b2.b.c(p2.v.h(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:22:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p2.o0 r17, long r18, vi.c r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.a(p2.o0, long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [fj.v] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p2.o0 r9, long r10, vi.c r12) {
        /*
            boolean r0 = r12 instanceof x.z
            if (r0 == 0) goto L13
            r0 = r12
            x.z r0 = (x.z) r0
            int r1 = r0.f19772e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19772e = r1
            goto L18
        L13:
            x.z r0 = new x.z
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f19771d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19772e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            fj.r r9 = r0.f19770c
            fj.v r10 = r0.f19769b
            p2.w r11 = r0.f19768a
            uk.c.R(r12)     // Catch: p2.p -> La6
            goto L99
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            uk.c.R(r12)
            p2.p0 r12 = r9.f12752f
            p2.n r12 = r12.L
            boolean r12 = h(r12, r10)
            if (r12 == 0) goto L44
            goto La5
        L44:
            p2.p0 r12 = r9.f12752f
            p2.n r12 = r12.L
            java.lang.Object r12 = r12.f12734a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            p2.w r7 = (p2.w) r7
            long r7 = r7.f12760a
            boolean r7 = p2.v.e(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            p2.w r11 = (p2.w) r11
            if (r11 != 0) goto L6b
            goto La5
        L6b:
            fj.v r10 = new fj.v
            r10.<init>()
            fj.v r12 = new fj.v
            r12.<init>()
            r12.f6807a = r11
            w2.h2 r2 = r9.C()
            long r5 = r2.b()
            fj.r r2 = new fj.r     // Catch: p2.p -> La6
            r2.<init>()     // Catch: p2.p -> La6
            x.a0 r7 = new x.a0     // Catch: p2.p -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: p2.p -> La6
            r0.f19768a = r11     // Catch: p2.p -> La6
            r0.f19769b = r10     // Catch: p2.p -> La6
            r0.f19770c = r2     // Catch: p2.p -> La6
            r0.f19772e = r3     // Catch: p2.p -> La6
            java.lang.Object r9 = r9.D(r5, r7, r0)     // Catch: p2.p -> La6
            if (r9 != r1) goto L98
            return r1
        L98:
            r9 = r2
        L99:
            boolean r9 = r9.f6803a     // Catch: p2.p -> La6
            if (r9 == 0) goto La5
            java.lang.Object r9 = r10.f6807a     // Catch: p2.p -> La6
            p2.w r9 = (p2.w) r9     // Catch: p2.p -> La6
            if (r9 != 0) goto La4
            return r11
        La4:
            return r9
        La5:
            return r4
        La6:
            java.lang.Object r9 = r10.f6807a
            p2.w r9 = (p2.w) r9
            if (r9 != 0) goto Lad
            goto Lae
        Lad:
            r11 = r9
        Lae:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.b(p2.o0, long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0161 -> B:62:0x0167). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(p2.o0 r18, long r19, uj.r r21, vi.a r22) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.c(p2.o0, long, uj.r, vi.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[PHI: r0 r1 r2 r5 r10 r11 r12
      0x00a9: PHI (r0v3 ej.e) = (r0v4 ej.e), (r0v7 ej.e) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r1v1 mc.e) = (r1v3 mc.e), (r1v7 mc.e) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r2v3 java.lang.Object) = (r2v9 java.lang.Object), (r2v1 java.lang.Object) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r5v2 p2.o0) = (r5v4 p2.o0), (r5v8 p2.o0) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r10v1 p2.w) = (r10v7 p2.w), (r10v0 p2.w) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v5 float) = (r11v6 float), (r11v9 float) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r12v2 fj.u) = (r12v4 fj.u), (r12v8 fj.u) binds: [B:21:0x00a5, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0167 -> B:60:0x016e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p2.o0 r18, long r19, int r21, uj.r r22, vi.a r23) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.d(p2.o0, long, int, uj.r, vi.a):java.lang.Object");
    }

    public static final Object e(p2.a0 a0Var, ej.c cVar, ej.a aVar, ej.a aVar2, ej.e eVar, ti.c cVar2) {
        Object objE = w2.e(a0Var, new sa.d(new s1.g(20), new ab.a0(cVar, 10), eVar, aVar2, new c1.l(9, aVar), null, 1), cVar2);
        ui.a aVar3 = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objE != aVar3) {
            objE = oVar;
        }
        return objE == aVar3 ? objE : oVar;
    }

    public static Object f(p2.a0 a0Var, ej.a aVar, fb.c cVar, ej.e eVar, ti.c cVar2, int i10) {
        ta.n nVar = new ta.n(25);
        ej.a gVar = cVar;
        if ((i10 & 4) != 0) {
            gVar = new s1.g(19);
        }
        Object objE = w2.e(a0Var, new sa.d(nVar, eVar, aVar, gVar, null, 2), cVar2);
        return objE == ui.a.f17085a ? objE : pi.o.f13011a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(p2.o0 r4, long r5, ej.c r7, vi.c r8) {
        /*
            boolean r0 = r8 instanceof x.d0
            if (r0 == 0) goto L13
            r0 = r8
            x.d0 r0 = (x.d0) r0
            int r1 = r0.f19486d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19486d = r1
            goto L18
        L13:
            x.d0 r0 = new x.d0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19485c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19486d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ej.c r4 = r0.f19484b
            p2.o0 r5 = r0.f19483a
            uk.c.R(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            uk.c.R(r8)
        L38:
            r0.f19483a = r4
            r0.f19484b = r7
            r0.f19486d = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            p2.w r8 = (p2.w) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p2.v.d(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f12760a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.g(p2.o0, long, ej.c, vi.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean h(p2.n nVar, long j) {
        Object obj;
        ?? r62 = nVar.f12734a;
        int size = r62.size();
        boolean z2 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i10);
            if (p2.v.e(((p2.w) obj).f12760a, j)) {
                break;
            }
            i10++;
        }
        p2.w wVar = (p2.w) obj;
        if (wVar != null && wVar.f12763d) {
            z2 = true;
        }
        return true ^ z2;
    }

    public static final float i(w2.h2 h2Var, int i10) {
        return i10 == 2 ? h2Var.f() * f19530a : h2Var.f();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x040b -> B:91:0x03bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0446 -> B:164:0x05a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0450 -> B:117:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0580 -> B:159:0x0586). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x059b -> B:164:0x05a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x05ff -> B:174:0x0602). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0236 -> B:31:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02cb -> B:31:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0322 -> B:77:0x038a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0376 -> B:74:0x037f). Please report as a decompilation issue!!! */
    public static final java.lang.Object j(p2.o0 r25, p2.w r26, s1.g r27, ab.a0 r28, ej.e r29, ej.a r30, c1.l r31, vi.a r32) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.j(p2.o0, p2.w, s1.g, ab.a0, ej.e, ej.a, c1.l, vi.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        if (r0 == 0.0f) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [ej.c] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:24:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(p2.o0 r17, long r18, t.a1 r20, vi.a r21) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.k(p2.o0, long, t.a1, vi.a):java.lang.Object");
    }
}

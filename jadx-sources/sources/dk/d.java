package dk;

import ak.c0;
import ak.n;
import ak.u;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f5159a;

    /* renamed from: b, reason: collision with root package name */
    public final ak.a f5160b;

    /* renamed from: c, reason: collision with root package name */
    public final f f5161c;

    /* renamed from: d, reason: collision with root package name */
    public final ak.j f5162d;

    /* renamed from: e, reason: collision with root package name */
    public ah.a f5163e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5164f;

    /* renamed from: g, reason: collision with root package name */
    public e f5165g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5166h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f5167i;

    public d(k kVar, f fVar, ak.a aVar, u uVar, ak.j jVar) {
        this.f5159a = kVar;
        this.f5161c = fVar;
        this.f5160b = aVar;
        this.f5162d = jVar;
        yh.c cVar = fVar.f5188e;
        h hVar = new h();
        List list = Collections.EMPTY_LIST;
        hVar.f5196e = list;
        hVar.f5197f = list;
        hVar.f5198g = new ArrayList();
        hVar.f5193b = aVar;
        hVar.f5194c = cVar;
        hVar.f5195d = jVar;
        List<Proxy> listSelect = aVar.f584g.select(aVar.f578a.l());
        hVar.f5196e = (listSelect == null || listSelect.isEmpty()) ? bk.d.j(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(listSelect));
        hVar.f5192a = 0;
        this.f5164f = hVar;
    }

    public final e a(boolean z2, int i10, int i11, int i12) throws Throwable {
        e eVar;
        Socket socket;
        Socket socketG;
        e eVar2;
        int i13;
        boolean z10;
        c0 c0Var;
        boolean z11;
        ArrayList arrayList;
        e eVar3;
        ah.a aVar;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.f5161c) {
            try {
                if (this.f5159a.d()) {
                    throw new IOException("Canceled");
                }
                this.f5166h = false;
                k kVar = this.f5159a;
                eVar = kVar.f5209i;
                socket = null;
                socketG = (eVar == null || !eVar.f5176k) ? null : kVar.g();
                k kVar2 = this.f5159a;
                eVar2 = kVar2.f5209i;
                if (eVar2 != null) {
                    eVar = null;
                } else {
                    eVar2 = null;
                }
                i13 = 1;
                if (eVar2 != null) {
                    z10 = false;
                    c0Var = null;
                } else if (this.f5161c.c(this.f5160b, kVar2, null, false)) {
                    eVar2 = this.f5159a.f5209i;
                    c0Var = null;
                    z10 = true;
                } else {
                    c0Var = this.f5167i;
                    if (c0Var != null) {
                        this.f5167i = null;
                    } else {
                        if (d()) {
                            c0Var = this.f5159a.f5209i.f5169c;
                        }
                        z10 = false;
                        c0Var = null;
                    }
                    z10 = false;
                }
            } finally {
            }
        }
        bk.d.d(socketG);
        if (eVar != null) {
            this.f5162d.getClass();
        }
        if (z10) {
            this.f5162d.getClass();
        }
        if (eVar2 != null) {
            return eVar2;
        }
        if (c0Var != null || ((aVar = this.f5163e) != null && aVar.f458b < aVar.f457a.size())) {
            z11 = false;
        } else {
            h hVar = this.f5164f;
            if (hVar.f5192a >= ((List) hVar.f5196e).size() && ((ArrayList) hVar.f5198g).isEmpty()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList2 = new ArrayList();
            while (hVar.f5192a < ((List) hVar.f5196e).size()) {
                ak.a aVar2 = (ak.a) hVar.f5193b;
                if (hVar.f5192a >= ((List) hVar.f5196e).size()) {
                    throw new SocketException("No route to " + aVar2.f578a.f676d + "; exhausted proxy configurations: " + ((List) hVar.f5196e));
                }
                List list = (List) hVar.f5196e;
                int i14 = hVar.f5192a;
                hVar.f5192a = i14 + 1;
                Proxy proxy = (Proxy) list.get(i14);
                ak.j jVar = (ak.j) hVar.f5195d;
                hVar.f5197f = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    n nVar = aVar2.f578a;
                    hostName = nVar.f676d;
                    port = nVar.f677e;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    port = inetSocketAddress.getPort();
                }
                if (port < i13 || port > 65535) {
                    throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    ((List) hVar.f5197f).add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    jVar.getClass();
                    aVar2.f579b.getClass();
                    if (hostName == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                        if (listAsList.isEmpty()) {
                            throw new UnknownHostException(aVar2.f579b + " returned no addresses for " + hostName);
                        }
                        int size = listAsList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            ((List) hVar.f5197f).add(new InetSocketAddress((InetAddress) listAsList.get(i15), port));
                        }
                    } catch (NullPointerException e10) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e10);
                        throw unknownHostException;
                    }
                }
                int size2 = ((List) hVar.f5197f).size();
                for (int i16 = 0; i16 < size2; i16++) {
                    c0 c0Var2 = new c0((ak.a) hVar.f5193b, proxy, (InetSocketAddress) ((List) hVar.f5197f).get(i16));
                    yh.c cVar = (yh.c) hVar.f5194c;
                    synchronized (cVar) {
                        zContains = ((LinkedHashSet) cVar.f20314b).contains(c0Var2);
                    }
                    if (zContains) {
                        ((ArrayList) hVar.f5198g).add(c0Var2);
                    } else {
                        arrayList2.add(c0Var2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    break;
                }
                i13 = 1;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll((ArrayList) hVar.f5198g);
                ((ArrayList) hVar.f5198g).clear();
            }
            ah.a aVar3 = new ah.a();
            aVar3.f458b = 0;
            aVar3.f457a = arrayList2;
            this.f5163e = aVar3;
            z11 = true;
        }
        synchronized (this.f5161c) {
            try {
                if (this.f5159a.d()) {
                    throw new IOException("Canceled");
                }
                if (z11) {
                    ah.a aVar4 = this.f5163e;
                    aVar4.getClass();
                    arrayList = new ArrayList(aVar4.f457a);
                    if (this.f5161c.c(this.f5160b, this.f5159a, arrayList, false)) {
                        eVar2 = this.f5159a.f5209i;
                        z10 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z10) {
                    if (c0Var == null) {
                        ah.a aVar5 = this.f5163e;
                        if (!(aVar5.f458b < aVar5.f457a.size())) {
                            throw new NoSuchElementException();
                        }
                        ArrayList arrayList3 = aVar5.f457a;
                        int i17 = aVar5.f458b;
                        aVar5.f458b = i17 + 1;
                        c0Var = (c0) arrayList3.get(i17);
                    }
                    eVar2 = new e(this.f5161c, c0Var);
                    this.f5165g = eVar2;
                }
                eVar3 = eVar2;
            } finally {
            }
        }
        if (z10) {
            this.f5162d.getClass();
            return eVar3;
        }
        eVar3.c(i10, i11, i12, z2, this.f5162d);
        this.f5161c.f5188e.k(eVar3.f5169c);
        synchronized (this.f5161c) {
            try {
                this.f5165g = null;
                if (this.f5161c.c(this.f5160b, this.f5159a, arrayList, true)) {
                    eVar3.f5176k = true;
                    socket = eVar3.f5171e;
                    eVar3 = this.f5159a.f5209i;
                    this.f5167i = c0Var;
                } else {
                    f fVar = this.f5161c;
                    if (!fVar.f5189f) {
                        fVar.f5189f = true;
                        f.f5183g.execute(fVar.f5186c);
                    }
                    fVar.f5187d.add(eVar3);
                    k kVar3 = this.f5159a;
                    if (kVar3.f5209i != null) {
                        throw new IllegalStateException();
                    }
                    kVar3.f5209i = eVar3;
                    eVar3.f5181p.add(new j(kVar3, kVar3.f5206f));
                }
            } finally {
            }
        }
        bk.d.d(socket);
        this.f5162d.getClass();
        return eVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b A[Catch: all -> 0x0018, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0007, B:6:0x000c, B:11:0x0015, B:15:0x001b), top: B:61:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dk.e b(int r9, int r10, int r11, boolean r12, boolean r13) throws java.lang.Throwable {
        /*
            r8 = this;
        L0:
            dk.e r0 = r8.a(r12, r9, r10, r11)
            dk.f r1 = r8.f5161c
            monitor-enter(r1)
            int r2 = r0.f5178m     // Catch: java.lang.Throwable -> L18
            r3 = 1
            if (r2 != 0) goto L1b
            gk.q r2 = r0.f5174h     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 != 0) goto L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            goto L82
        L18:
            r9 = move-exception
            goto L88
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            java.net.Socket r1 = r0.f5171e
            boolean r1 = r1.isClosed()
            if (r1 != 0) goto L83
            java.net.Socket r1 = r0.f5171e
            boolean r1 = r1.isInputShutdown()
            if (r1 != 0) goto L83
            java.net.Socket r1 = r0.f5171e
            boolean r1 = r1.isOutputShutdown()
            if (r1 == 0) goto L35
            goto L83
        L35:
            gk.q r1 = r0.f5174h
            if (r1 == 0) goto L5a
            long r2 = java.lang.System.nanoTime()
            monitor-enter(r1)
            boolean r4 = r1.f7499z     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L44
            monitor-exit(r1)
            goto L83
        L44:
            long r4 = r1.F     // Catch: java.lang.Throwable -> L54
            long r6 = r1.E     // Catch: java.lang.Throwable -> L54
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L56
            long r4 = r1.G     // Catch: java.lang.Throwable -> L54
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L56
            monitor-exit(r1)
            goto L83
        L54:
            r9 = move-exception
            goto L58
        L56:
            monitor-exit(r1)
            goto L82
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r9
        L5a:
            if (r13 == 0) goto L82
            java.net.Socket r1 = r0.f5171e     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            int r1 = r1.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            java.net.Socket r2 = r0.f5171e     // Catch: java.lang.Throwable -> L7b
            r2.setSoTimeout(r3)     // Catch: java.lang.Throwable -> L7b
            kk.x r2 = r0.f5175i     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L75
            java.net.Socket r2 = r0.f5171e     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r2.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            goto L83
        L75:
            java.net.Socket r2 = r0.f5171e     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r2.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            goto L82
        L7b:
            r2 = move-exception
            java.net.Socket r3 = r0.f5171e     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r3.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            throw r2     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
        L82:
            return r0
        L83:
            r0.h()
            goto L0
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.d.b(int, int, int, boolean, boolean):dk.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x000c, B:12:0x0012, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:32:0x0050, B:22:0x0030, B:25:0x003f), top: B:36:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r6 = this;
            dk.f r0 = r6.f5161c
            monitor-enter(r0)
            ak.c0 r1 = r6.f5167i     // Catch: java.lang.Throwable -> La
            r2 = 1
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r1 = move-exception
            goto L52
        Lc:
            boolean r1 = r6.d()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L1c
            dk.k r1 = r6.f5159a     // Catch: java.lang.Throwable -> La
            dk.e r1 = r1.f5209i     // Catch: java.lang.Throwable -> La
            ak.c0 r1 = r1.f5169c     // Catch: java.lang.Throwable -> La
            r6.f5167i = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L1c:
            ah.a r1 = r6.f5163e     // Catch: java.lang.Throwable -> La
            r3 = 0
            if (r1 == 0) goto L30
            int r4 = r1.f458b     // Catch: java.lang.Throwable -> La
            java.util.ArrayList r1 = r1.f457a     // Catch: java.lang.Throwable -> La
            int r1 = r1.size()     // Catch: java.lang.Throwable -> La
            if (r4 >= r1) goto L2d
            r1 = r2
            goto L2e
        L2d:
            r1 = r3
        L2e:
            if (r1 != 0) goto L50
        L30:
            dk.h r1 = r6.f5164f     // Catch: java.lang.Throwable -> La
            int r4 = r1.f5192a     // Catch: java.lang.Throwable -> La
            java.lang.Object r5 = r1.f5196e     // Catch: java.lang.Throwable -> La
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> La
            int r5 = r5.size()     // Catch: java.lang.Throwable -> La
            if (r4 >= r5) goto L3f
            goto L49
        L3f:
            java.io.Serializable r1 = r1.f5198g     // Catch: java.lang.Throwable -> La
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L4b
        L49:
            r1 = r2
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 == 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.d.c():boolean");
    }

    public final boolean d() {
        e eVar = this.f5159a.f5209i;
        return eVar != null && eVar.f5177l == 0 && bk.d.n(eVar.f5169c.f603a.f578a, this.f5160b.f578a);
    }
}

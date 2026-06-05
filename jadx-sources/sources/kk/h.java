package kk;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public interface h extends c0, ReadableByteChannel {
    String I(Charset charset);

    boolean N(long j);

    String S();

    int U(s sVar);

    void b0(long j);

    long c0();

    i h(long j);

    f q();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String u(long j);
}

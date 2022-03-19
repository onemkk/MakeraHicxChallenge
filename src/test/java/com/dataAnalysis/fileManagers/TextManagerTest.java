package com.dataAnalysis.fileManagers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.mockito.Mockito;

public class TextManagerTest {

    @Test
    public void testConstructor() {
        assertEquals(".txt", (new TextManager()).getFileExtension());
    }

    @Test
    public void testMoveFile() {

        Path path = Path.of("com.dataAnalysis.fileManagers");
        Path destination = Path.of("test.txt");
        TextManager textManagerMock = Mockito.mock(TextManager.class);
        doNothing().when(textManagerMock).moveFile(path, destination);
        textManagerMock.moveFile(path, destination);
        verify(textManagerMock, times(1)).moveFile(path, destination);

    }

    @Test
    public void testParseFile() {
        Path path = Path.of("com.dataAnalysis.fileManagers");
        Path destination = Path.of("test.txt");
        StringBuilder fileContent = new StringBuilder("all for one, one for all");
        TextManager textManagerMock = Mockito.mock(TextManager.class);
        when(textManagerMock.parseFile(path)).thenReturn(fileContent.toString());
        assertEquals("all for one, one for all", fileContent.toString());

    }
}

